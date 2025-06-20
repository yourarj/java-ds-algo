package com.github.yourarj.gfg_amzn_sde_dsa.sorting.inversion_count;

public class Solution {
  public static int inversionCount(int[] arr) {
    return sort(arr, 0, arr.length - 1);
  }

  public static int sort(final int[] arr, final int l, final int r) {
    if (l >= r) return 0;

    final int m = l + (r - l) / 2;

    int inversion = 0;
    // recursively sort
    inversion += sort(arr, l, m);
    inversion += sort(arr, m + 1, r);

    final int[] sortedArray = new int[r - l + 1];
    int lp = l, rp = m + 1, saCurr = 0;

    // iterate both array until both arrays of have at least one element
    while (lp <= m && rp <= r) {
      if (arr[lp] <= arr[rp]) {
        sortedArray[saCurr++] = arr[lp++];
      } else {
        sortedArray[saCurr++] = arr[rp++];
        inversion += (m - lp + 1);
      }
    }

    // iterate remaining left part
    while (lp <= m) {
      sortedArray[saCurr++] = arr[lp++];
    }

    // iterate remaining right part
    while (rp <= r) {
      sortedArray[saCurr++] = arr[rp++];
    }

    System.arraycopy(sortedArray, 0, arr, l, sortedArray.length);

    return inversion;
  }
}
