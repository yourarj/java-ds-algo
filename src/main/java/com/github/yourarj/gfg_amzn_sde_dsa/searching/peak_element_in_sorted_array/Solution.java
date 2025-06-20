package com.github.yourarj.gfg_amzn_sde_dsa.searching.peak_element_in_sorted_array;

public class Solution {
  public static int peakElement(int[] arr) {
    if (null == arr || arr.length == 0) return -1;

    final int N = arr.length;
    // check first or last element are the peak
    if (arr[0] > arr[1]) return 0;
    if (arr[N - 1] > arr[N - 2]) return N - 1;

    int low = 1, high = N - 2, mid;

    while (low <= high) {
      mid = low + (high - low) / 2;

      if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) return mid;

      if (arr[mid] <= arr[mid + 1]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
