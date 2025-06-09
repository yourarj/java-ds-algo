package com.github.yourarj.gfg_amzn_sde_dsa.searching.binary_search;

public class Solution {
  public static int binarySearch(int[] haystack, int needle) {
    int low = 0, high = haystack.length - 1, mid;

    while (low <= high) {
      mid = low + (high - low) / 2;

      // check if current element is the desired one
      if (haystack[mid] == needle) return mid;

      // narrow down the area now
      if (haystack[mid] < needle) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
