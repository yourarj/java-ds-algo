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

  private int numberOfChunksFormed(final int targetSum, final int[] nums) {
    int chunks = 1;
    int chunkSum = 0;
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
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
