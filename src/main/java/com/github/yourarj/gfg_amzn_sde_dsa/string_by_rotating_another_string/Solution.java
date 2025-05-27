package com.github.yourarj.gfg_amzn_sde_dsa.string_by_rotating_another_string;

public class Solution {
  public static boolean isRotated(String str1, String str2) {
    // if both strings are not of the same length
    if (str1.length() != str2.length()) return false;

    boolean clockwise = true, anticlockwise = true;
    final int stringLength = str1.length();

    // clockwise
    for (int i = 0; i < str1.length(); i++) {
      if (clockwise && str1.charAt(i) != str2.charAt((i + 2) % stringLength)) {
        clockwise = false;
      }

      if (anticlockwise && str1.charAt((i + 2) % stringLength) != str2.charAt(i)) {
        anticlockwise = false;
      }
    }
    return clockwise || anticlockwise;
  }
}
