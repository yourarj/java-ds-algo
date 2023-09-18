package com.github.yourarj.sorting;

public class InsertionSort {
  public void sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (array[j] < array[j - 1]) {
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        } else {
          break;
        }
      }
    }
  }
}
