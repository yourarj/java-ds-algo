package com.github.yourarj.sorting;

public class BubbleSort {
  public void bubble(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean swappedAtLeastOnce = false;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int tmp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = tmp;
          swappedAtLeastOnce = true;
        }
      }
      // save extra work if already sorted
      if (!swappedAtLeastOnce) {
        System.out.println("breaking");
        break;
      }
    }
  }
}
