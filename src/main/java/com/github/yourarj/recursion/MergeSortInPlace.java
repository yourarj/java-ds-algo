package com.github.yourarj.recursion;

public class MergeSortInPlace {
  /**
   * Sort given array with merge sort with NlogN time complexity and O(N) auxiliary space
   *
   * @param arr input integer array
   */
  public void sort(int[] arr) {
    if (null == arr || arr.length < 2) {
      return;
    }

    mergeSortInPlace(arr, 0, arr.length - 1);
  }

  private void mergeSortInPlace(int[] arr, int start, int end) {
    if (start == end) {
      return;
    }
    int mid = start + (end - start) / 2;

    mergeSortInPlace(arr, start, mid);
    mergeSortInPlace(arr, mid + 1, end);

    // define pointers for merge
    int leftPointer = start;
    int rightPointer = mid + 1;
    int mergePointer = 0;

    // create new temp array to store sorted array
    int[] merged = new int[1 + end - start];

    // start merging till either of array runs out of elements
    while (leftPointer <= mid && rightPointer <= end) {
      if (arr[leftPointer] < arr[rightPointer]) {
        merged[mergePointer] = arr[leftPointer];
        leftPointer++;
      } else {
        merged[mergePointer] = arr[rightPointer];
        rightPointer++;
      }
      mergePointer++;
    }

    while (leftPointer <= mid) {
      merged[mergePointer] = arr[leftPointer];
      leftPointer++;
      mergePointer++;
    }

    while (rightPointer <= end) {
      merged[mergePointer] = arr[rightPointer];
      rightPointer++;
      mergePointer++;
    }

    for (int i = 0; start <= end; i++, start++) {
      arr[start] = merged[i];
    }
  }
}
