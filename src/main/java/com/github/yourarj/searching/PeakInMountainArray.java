package com.github.yourarj.searching;

public class PeakInMountainArray {
  public int findPeak(int[] mountain) {
    // assumption:
    // as it's mountain array we are expecting at least three elements in array
    int start = 0;
    int end = mountain.length - 1;

    while (start != end) {
      System.out.printf("start: %02d, end: %02d\n", start, end);
      int mid = start + (end - start) / 2;

      if (mountain[mid + 1] > mountain[mid]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    System.out.printf("start: %02d, end: %02d\n", start, end);
    return mountain[start];
  }
}
