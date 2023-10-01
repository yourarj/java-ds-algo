package com.github.yourarj.recursion;


public class QuickSort {
  public void sort(int[] arr) {
    if (null == arr || arr.length < 2) {
      return;
    }

    quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int left, int right) {
    if (left >= right) {
      return;
    }

    int start = left;
    int end = right;
    int mid = left + (right - left) / 2;
    int pivot = arr[mid];

    while (start <= end) {
      while (arr[start] < pivot) {
        start++;
      }
      while (arr[end] > pivot) {
        end--;
      }
      if (start <= end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
      }
    }
    // now pivot is in it's expected place
    // call quicksort again
    quickSort(arr, left, end);
    quickSort(arr, start, right);
  }
}
