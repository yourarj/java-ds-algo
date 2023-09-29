package com.github.yourarj.recursion;

public class SelectionSort {
  public void sort(int[] arr) {
    if (null == arr || arr.length < 2) return;

    __selection_sort_recursive(arr, arr.length - 1, 0, 0);
  }

  private void __selection_sort_recursive(int[] arr, int i, int j, int largest) {
    if (i < 0) {
      return;
    }

    if (arr[largest] < arr[j]) largest = j;
    j++;

    if (j > i) {
      // once we are done with finding the largest element
      if (arr[i] < arr[largest]) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
      }
      // now after adjust array pointers
      i--;
      j = 0;
      largest = j;
    }
    __selection_sort_recursive(arr, i, j, largest);
  }
}
