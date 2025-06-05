package com.github.yourarj.gfg_amzn_sde_dsa.string.smallest_window_containing_all_chars;

public class Solution {
  public static String smallestWindow(String s, String p) {
    final int sLength = s.length(), pLength = p.length();

    // check if the pattern is larger than given string return empty
    if (sLength < pLength) return "";

    final int[] sFreq = new int[256];
    final int[] pFreq = new int[256];

    // calculate the pattern character frequency
    // we will assume string is ASCII encoded
    for (int i = 0; i < pLength; i++) {
      ++pFreq[p.charAt(i)];
    }

    int left = 0, matchedCharTillNow = 0, matchFoundAt = -1, minLength = Integer.MAX_VALUE;

    for (int right = 0; right < sLength; right++) {
      char curr = s.charAt(right);

      ++sFreq[curr];
      // increment matchedCharTillNow only when current character is part of
      // pattern and matched characters are less than expected frequency in

      if (pFreq[curr] > 0 && sFreq[curr] <= pFreq[curr]) matchedCharTillNow++;

      // if we have got all required characters
      if (matchedCharTillNow == pLength) {
        // we will try to shrink the window in S from left
        while (sFreq[curr = s.charAt(left)] > pFreq[curr] || pFreq[curr] == 0) {
          if (sFreq[curr] > pFreq[curr]) {
            --sFreq[curr];
          }
          ++left;
        }

        if (minLength > right - left + 1) {
          minLength = right - left + 1;
          matchFoundAt = left;
        }
      }

    }
    return minLength == Integer.MAX_VALUE ? "" : s.substring(matchFoundAt, matchFoundAt + minLength);
  }

}
