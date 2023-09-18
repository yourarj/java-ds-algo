package com.github.yourarj.searching;

public class SearchInRotatedSortedArrayWithDuplicates {

  /**
   * Find index of element in rotated sorted array
   *
   * @param needle number to be found
   * @param haystack source array of integers
   * @return position of element if found -1 otherwise
   */
  public int search(int needle, int[] haystack) {
    int peakOfMountain = findPivotInSortedRotatedArray(haystack);
    int pos = binarySearch(needle, haystack, 0, peakOfMountain);
    if (-1 == pos) {
      pos = binarySearch(needle, haystack, peakOfMountain + 1, haystack.length - 1);
    }
    return pos;
  }

  /**
   * find pivot in array
   *
   * @param array array array
   * @return position of peak
   */
  private int findPivotInSortedRotatedArray(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (array[mid - 1] <= array[mid] && array[mid] >= array[0]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start - 1;
  }

  /**
   * find the element
   *
   * @param needle element which needs to be found
   * @param haystack source array
   * @return the position of needle in haystack if found -1 otherwise
   */
  private int binarySearch(int needle, int[] haystack, int start, int end) {

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (needle == haystack[mid]) {
        return mid;
      } else if (needle < haystack[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
