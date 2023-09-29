package com.github.yourarj.recursion;

public class BubbleSort {
  public void sort(int[] arr) {
    if (arr.length < 2) return;
    bubbleRecursively(arr, arr.length - 1, 1);
  }

  private void bubbleRecursively(int[] arr, int i, int j) {
    // base condition
    if (i < 0) {
      return;
    }
    if (j > i) {
      i--;
      j = 1;
    }

    // compare and swap elements
    if (arr[j - 1] > arr[j]) {
      int temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
    }

    j++;
    bubbleRecursively(arr, i, j);
  }
}
