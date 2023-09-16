package com.github.yourarj.searching;

public class NumberOfRotationsInSortedArray {
  public int numberOfRotations(int[] array) {

    int pivotElement = findPivotElement(array);
    // number of rotations = index of pivot + 1
    return pivotElement == array.length - 1 ? 0 : pivotElement + 1;
  }

  private int findPivotElement(int[] array) {
    int start = 0;
    int end = array.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (array[mid] <= array[mid] && array[0] <= array[mid]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return array[start - 1] < array[start] ? -1 : start - 1;
  }
}
