package com.github.yourarj.leetcode_top_interview_150.mergeinterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

    List<int[]> list = new ArrayList<>();

    int start = intervals[0][0], end = intervals[0][1];
    for (int[] interval : intervals) {
      if (interval[0] > end) {
        list.add(new int[] {start, end});
        start = interval[0];
      }

      end = interval[1];
    }
    return list.toArray(new int[list.size()][]);
  }
}
