package com.github.yourarj.sorting.sort_array_of_012s;

public class Solution {
  public static void sort012(final int[] arr) {
    // take three pointer
    int left = 0, right = arr.length - 1;
    int curr = 0;

    // while both pointers don't cross each other
    while (curr <= right) {
      if (arr[curr] == 0) {
        swap(arr, left, curr);
        left++;
        curr++;
      } else if (arr[curr] == 2) {
        swap(arr, curr, right);
        right--;
      } else if (arr[curr] == 1) {
        curr++;
      }
    }
  }

  private static void swap(final int[] arr, final int left, final int right) {
    int tmp = arr[left];
    arr[left] = arr[right];
    arr[right] = tmp;
  }
}
