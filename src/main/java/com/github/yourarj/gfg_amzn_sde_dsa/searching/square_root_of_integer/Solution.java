package com.github.yourarj.gfg_amzn_sde_dsa.searching.square_root_of_integer;

public class Solution {
  public static int findSquareRoot(final int number) {
    int low = 1, high = number, mid = 1, midSquare;

    while (low <= high) {
      mid = low + (high - low) / 2;

      midSquare = mid * mid;
      if (mid * mid == number) return mid;

      if (midSquare < number) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return mid - 1;
  }
}
