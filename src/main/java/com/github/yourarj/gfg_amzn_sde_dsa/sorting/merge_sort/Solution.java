package com.github.yourarj.gfg_amzn_sde_dsa.sorting.merge_sort;

public class Solution {
  public static void sort(final int[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(final int[] arr, final int left, final int right) {

    if (left < right) {
      int mid = left + (right - left) / 2;
      sort(arr, left, mid);
      sort(arr, mid + 1, right);

      // merge logic
      int[] result = new int[right - left + 1];
      int lStart = left, rStart = mid + 1, resPointer = 0;

      while (lStart <= mid && rStart <= right) {
        if (arr[lStart] <= arr[rStart]) {
          result[resPointer++] = arr[lStart++];
        } else {
          result[resPointer++] = arr[rStart++];
        }
      }

      // copy remaining parts from left if present
      while (lStart <= mid) {
        result[resPointer++] = arr[lStart++];
      }

      // copy remaining parts from right if present
      while (rStart <= right) {
        result[resPointer++] = arr[rStart++];
      }
      System.arraycopy(result, 0, arr, left, result.length);
    }
  }


}
