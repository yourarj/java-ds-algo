package com.github.yourarj.gfg_amzn_sde_dsa.searching.median_of_two_sorted_arrays;

/**
 * Median of two sorted arrays of different sizes
 * Will be using binary search
 */
public class Solution {
  public static double medianOfTwoSortedArrays(final int[] shortArray, final int[] longArray) {
    // get sizes of arrays;
    final int sLen = shortArray.length, lLen = longArray.length;

    if (sLen >= lLen) {
      return medianOfTwoSortedArrays(longArray, shortArray);
    }

    int low = 0, hi = sLen, mid1 = -1, mid2 = -1;

    while (low <= hi) {
      mid1 = low + (hi - low) / 2;
      mid2 = ((lLen + sLen + 1) / 2) - mid1;

      int shortLeft = mid1 == 0 ? Integer.MIN_VALUE : shortArray[mid1 - 1];
      int shortRight = mid1 == sLen ? Integer.MAX_VALUE : shortArray[mid1];

      int longLeft = mid2 == 0 ? Integer.MIN_VALUE : longArray[mid2 - 1];
      int longRight = mid2 == lLen ? Integer.MAX_VALUE : longArray[mid2];

      if (shortLeft <= longRight && longLeft <= shortRight) {
        return (sLen + lLen) % 2 == 0
          ? (Math.max(shortLeft, longLeft) + Math.min(shortRight, longRight)) / 2.0
          : Math.max(shortLeft, longLeft);
      }

      if (shortLeft < longRight) {
        low = mid1 + 1;
      } else {
        hi = mid1 - 1;
      }
    }
    return 0;

  }
}

