package com.github.yourarj.leetcode_top_interview_150.mergeinterval;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void merge() {
    final int[][] input = {{8, 10}, {1, 3}, {2, 6}, {15, 18}};
    target.merge(input);
  }
}
