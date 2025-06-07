package com.github.yourarj.gfg_amzn_sde_dsa.string.make_two_strings_anagram;

import java.util.Arrays;

public class Solution {
  public static int makeAnagram(final String s1, final String s2) {
    final int minLength = Math.min(s1.length(), s2.length());
    final int[] f = new int[26];

    int i = 0;
    for (; i < minLength; i++) {
      ++f[s1.charAt(i) - 'a'];
      --f[s2.charAt(i) - 'a'];
    }

    for (; i < s1.length(); i++) {
      ++f[s1.charAt(i) - 'a'];
    }

    for (; i < s2.length(); i++) {
      --f[s2.charAt(i) - 'a'];
    }

    return Arrays.stream(f).map(Math::abs).sum();
  }
}
