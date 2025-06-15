package com.github.yourarj.gfg_amzn_sde_dsa.string.permutation_of_string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Get all permutations of given string
 */
public class Solution {
  public static List<String> getPermutations(String string) {

    final List<String> resultHolder = new ArrayList<>();

    StringBuilder builder = new StringBuilder(string);
    // populate resultHolder
    recurPermute(0, builder, resultHolder);

    Collections.sort(resultHolder);

    return resultHolder;
  }

  // Recursive function to generate
  // all permutations of string s
  static void recurPermute(int index, StringBuilder s,
                           List<String> ans) {

    // Base Case
    if (index == s.length()) {
      ans.add(s.toString());
      return;
    }

    // Swap the current index with all
    // possible indices and recur
    for (int i = index; i < s.length(); i++) {
      swap(s, index, i);
      recurPermute(index + 1, s, ans);
      swap(s, index, i);
    }
  }

  // Swap characters at positions i and j
  static void swap(StringBuilder s, int i, int j) {
    char temp = s.charAt(i);
    s.setCharAt(i, s.charAt(j));
    s.setCharAt(j, temp);
  }
}
