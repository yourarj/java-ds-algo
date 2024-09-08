package com.github.yourarj.leetcode_top_interview_150.minarraysburstbaloon;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

    int total = 1;
    int lastEnd = points[0][1];
    for (int[] point : points) {
      if (lastEnd < point[0]) {
        total++;
        lastEnd = point[1];
      }
    }
    return total;
  }
}
