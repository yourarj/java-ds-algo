package com.github.yourarj.searching;

/** Searching an element in Mountain array */
public class SearchMountainArray {
  public int search(int needle, int[] haystack) {
    // we will perform in two-step
    // find peak element index and perform order agnostic binary search
    int peakPosition = findPeakPosition(haystack);
    int resultInLeft = orderAgnosticBinarySearch(needle, haystack, 0, peakPosition);
    if (resultInLeft < 0) {
      return orderAgnosticBinarySearch(needle, haystack, peakPosition + 1, haystack.length - 1);
    } else {
      return resultInLeft;
    }
  }

  /**
   * find position of peak of mountain array
   *
   * @param mountain input array
   * @return returns index of peak
   */
  public int findPeakPosition(int[] mountain) {
    int start = 0;
    int end = mountain.length - 1;

    while (start != end) {
      int mid = start + (end - start) / 2;

      if (mountain[mid + 1] > mountain[mid]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }

  /**
   * Order agnostic binary search. Works with both Ascending or Descending sorted arrays
   *
   * @param needle number to find
   * @param haystack array in which we'll find
   * @param start start location
   * @param end end location
   * @return position of desired element if found else -1
   */
  public int orderAgnosticBinarySearch(int needle, int[] haystack, int start, int end) {
    boolean isAscending = haystack[start] < haystack[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (haystack[mid] == needle) {
        return mid;
      } else if (isAscending && needle < haystack[mid]) {
        end = mid - 1;
      } else if (isAscending && needle > haystack[mid]) {
        start = mid + 1;
      } else if (!isAscending && needle < haystack[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
