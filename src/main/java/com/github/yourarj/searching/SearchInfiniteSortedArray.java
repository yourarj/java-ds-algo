package com.github.yourarj.searching;

/** Find position of an element in a sorted array of infinite numbers */
public class SearchInfiniteSortedArray {
  /**
   * Finds the position (index) of specified elements in infinite sorted array
   *
   * @param needle element which needs to be found
   * @param haystack infinite sorted array
   * @return position (index) of desired element
   */
  public int findPosition(int needle, int[] haystack) {
    // as the provided array is infinite (technically we are saying we can't utilize the
    // `haystack.length`)
    // we will start with small chunk where we know the start and end. If element is greater than
    // our chunk end
    // we will double the size of input

    int start = 0;
    int end = 1;

    // stop the while loop when needle is smaller than or equal to end
    // else move forward and also increase the chunk size
    while (needle > haystack[end]) {
      System.out.printf(
          "start: %02d, end: %02d and haystack[end]: %02d%n", start, end, haystack[end]);
      int newStart = end + 1;
      end = newStart + (end - start) * 2 + 1;
      start = newStart;
    }
    System.out.printf(
        "Found: start: %02d, end: %02d and haystack[end]: %02d%n", start, end, haystack[end]);

    // it broke out so we got our start end
    // now just apply our good old binary search

    return binarySearch(needle, haystack, start, end);
  }

  /**
   * Binary search: perform a binary search and return the position of element in array return -1 if
   * element not found
   *
   * @param needle desired element
   * @param haystack the array which needs to be searched in
   * @param start start of search
   * @param end end of search
   * @return position of desired element if found and -1 otherwise
   */
  private int binarySearch(int needle, int[] haystack, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (haystack[mid] == needle) {
        return mid;
      } else if (haystack[mid] < needle) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
