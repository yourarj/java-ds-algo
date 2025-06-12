package com.github.yourarj.gfg_amzn_sde_dsa.string.atoi_impl;

public class Solution {
  public static int myAtoi(String string) {
    int sign = 1, res = 0, idx = 0;

    // ignore whitespaces
    while (idx < string.length() && string.charAt(idx) == ' ') {
      idx++;
    }

    if (idx < string.length() && (string.charAt(idx) == '-' || string.charAt(idx) == '+')) {
      if (string.charAt(idx) == '-') {
        sign = -1;
      }
      idx++;
    }

    while (idx < string.length() && string.charAt(idx) >= '0' && string.charAt(idx) <= '9') {
      if (res > Integer.MAX_VALUE / 10 ||
        (res == Integer.MAX_VALUE / 10 && string.charAt(idx) - '0' > 7)) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      int digit = string.charAt(idx) - '0';
      res = res * 10 + digit;
      idx++;
    }
    if (res != 0 && sign == -1) {
      res = -res;
    }

    return res;
  }
}
