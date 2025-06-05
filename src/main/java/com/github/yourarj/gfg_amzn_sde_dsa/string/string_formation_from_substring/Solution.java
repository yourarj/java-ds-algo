package com.github.yourarj.gfg_amzn_sde_dsa.string.string_formation_from_substring;

public class Solution {
  public static boolean isRepeat(final String s) {
    int n = s.length();
    int[] lps = new int[n];

    // Preprocess the pattern (calculate lps[] array)
    computeLPSArray(s, n, lps);

    int len = lps[n - 1];
    return len > 0 && n % (n - len) == 0;
  }

  static void computeLPSArray(final String str, final int StringLength, final int[] lps) {
    int left = 0, right;

    lps[0] = 0; // lps[0] is always 0
    right = 1;

    // for right = 1 to StringLength-1
    while (right < StringLength) {
      if (str.charAt(right) == str.charAt(left)) {
        left++;
        lps[right] = left;
        right++;
      } else {
        if (left != 0) {
          left = lps[left - 1];
        } else {
          lps[right] = 0;
          right++;
        }
      }
    }
  }
}
