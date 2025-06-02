package com.github.yourarj.gfg_amzn_sde_dsa.substring_without_repeatation;

import java.util.Arrays;

public class Solution {
  public static int longestUniqueSubString(final String s) {
    final int[] alpha = new int[26];
    Arrays.fill(alpha, -1);

    final int len = s.length();
    int maxLen = 0, left = 0, right = 0, index;
    char c;

    while (right < len) {
      c = s.charAt(right);
      index = c - 'a';
      if (alpha[index] != -1) {
        left = Math.max(alpha[index] + 1, left);
      }
      alpha[index] = right;
      maxLen = Math.max(maxLen, right - left + 1);
      right++;
    }
    return maxLen;
  }
}
