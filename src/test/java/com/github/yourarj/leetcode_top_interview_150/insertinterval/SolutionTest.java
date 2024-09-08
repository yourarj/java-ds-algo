package com.github.yourarj.leetcode_top_interview_150.insertinterval;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void insert() {
    int[][] arr = {{1, 3}, {6, 9}};
    int[] newInterval = {2, 5};

    target.insert(arr, newInterval);
  }
}
