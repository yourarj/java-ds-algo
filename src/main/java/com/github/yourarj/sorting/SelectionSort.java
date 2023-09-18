package com.github.yourarj.sorting;

public class SelectionSort {
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int smallestInSubArray = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[smallestInSubArray]) {
          smallestInSubArray = j;
        }
      }
      if (smallestInSubArray != i) {
        int temp = arr[i];
        arr[i] = arr[smallestInSubArray];
        arr[smallestInSubArray] = temp;
      }
    }
  }
}
