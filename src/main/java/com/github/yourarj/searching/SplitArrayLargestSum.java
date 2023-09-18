package com.github.yourarj.searching;

public class SplitArrayLargestSum {
  public int splitArray(int[] numbers, int k) {
    int start = 0;
    int end = 0;
    for (int num : numbers) {
      start = Math.max(start, num);
      end += num;
    }

    while (start < end) {

      int mid = start + (end - start) / 2;
      if (numberOfChunksFormed(mid, numbers) <= k) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  private int numberOfChunksFormed(final int targetSum, final int[] numbers) {
    int chunks = 1;
    int chunkSum = 0;
    for (int num : numbers) {
      if ((chunkSum + num) > targetSum) {
        chunks++;
        chunkSum = num;
      } else {
        chunkSum += num;
      }
    }
    return chunks;
  }
}
