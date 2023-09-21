package com.github.yourarj.recursion;

public class BinarySearch {
  public int search(int needle, int[] haystack) {
    return binarySearchWithRecursion(needle, haystack, 0, haystack.length - 1);
  }

  private int binarySearchWithRecursion(int needle, int[] haystack, int start, int end) {
    int result = -1;
    if (start > end) {
      return result;
    }

    final int mid = start + (end - start) / 2;

    if (haystack[mid] == needle) {
      result = mid;
    } else if (haystack[mid] < needle) {
      start = mid + 1;
      result = binarySearchWithRecursion(needle, haystack, start, end);
    } else {
      end = mid - 1;
      result = binarySearchWithRecursion(needle, haystack, start, end);
    }
    return result;
  }
}
