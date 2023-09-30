package com.github.yourarj.recursion;


public class MergeSortWithAuxiliarySpace {
  /**
   * Sort given array with merge sort with NlogN time complexity and O(N) auxiliary space
   *
   * @param arr input integer array
   */
  public int[] sort(int[] arr) {
    if (arr.length < 1) {
      return arr;
    }
    return mergeSort(arr, 0, arr.length - 1);
  }

  // {3,2,1}
  public int[] mergeSort(int[] arr, int start, int end) {
    // base condition
    if (start == end) {
      return new int[] {arr[start]};
    }

    int mid = start + (end - start) / 2;

    int[] sortedLeft = mergeSort(arr, start, mid);
    int[] sortedRight = mergeSort(arr, mid + 1, end);

    int[] mergedArray = new int[sortedLeft.length + sortedRight.length];
    for (int left = 0, right = 0, target = 0;
        left < sortedLeft.length || right < sortedRight.length; ) {
      if (right >= sortedRight.length) {
        mergedArray[target] = sortedLeft[left];
        left++;
      } else if (left >= sortedLeft.length) {
        mergedArray[target] = sortedRight[right];
        right++;
      } else {
        if (sortedLeft[left] < sortedRight[right]) {
          mergedArray[target] = sortedLeft[left];
          left++;
        } else {
          mergedArray[target] = sortedRight[right];
          right++;
        }
      }
      target++;
    }
    return mergedArray;
  }
}
