package com.github.yourarj.sorting;

public class CycleSort {
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length; ) {
      if (arr[i] != i + 1) {
        int temp = arr[arr[i] - 1];
        arr[arr[i] - 1] = arr[i];
        arr[i] = temp;
      } else {
        i++;
      }
    }
  }
}
