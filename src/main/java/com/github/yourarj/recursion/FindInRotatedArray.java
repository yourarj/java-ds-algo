package com.github.yourarj.recursion;

public class FindInRotatedArray {
  public final int find(int[] arr, int needle, int start, int end) {

    // if reached the end
    if (start > end) {
      return -1;
    }

    int mid = start + (end - start) / 2;
    if (arr[mid] == needle) {
      return mid;
    }

    if (arr[start] < arr[mid]) {
      if (needle >= arr[start] && needle < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    } else {
      if (needle > arr[mid] && needle <= arr[end]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return find(arr, needle, start, end);
  }
}
