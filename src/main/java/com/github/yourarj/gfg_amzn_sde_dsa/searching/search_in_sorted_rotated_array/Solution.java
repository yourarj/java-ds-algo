package com.github.yourarj.gfg_amzn_sde_dsa.searching.search_in_sorted_rotated_array;

public class Solution {
  public static int search(int[] arr, int key) {
    int left = 0, right = arr.length - 1;

    // didn't find the item we are looking for
    while (left <= right) {

      // calculate mid
      int mid = left + (right - left) / 2;
      // found the item
      if (arr[mid] == key) return mid;

      else if (arr[left] <= arr[mid]) {
        if (arr[left] <= key && key < arr[mid]) right = mid - 1;
        else left = mid + 1;
      } else {
        if (arr[mid] < key && key <= arr[right]) left = mid + 1;
        else right = mid - 1;
      }
    }
    return -1;
  }
}
