package com.github.yourarj.leetcode_top_interview_150.rotatearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void rotate01() {
    final int[][] input = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    final int[][] expected = {
      {3, 6, 9},
      {2, 5, 8},
      {1, 4, 7}
    };
    // rotate array
    target.rotateAntiClockwise(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void rotate02() {
    final int[][] input = {
      {5, 1, 9, 11},
      {2, 4, 8, 10},
      {13, 3, 6, 7},
      {15, 14, 12, 16}
    };

    final int[][] expected = {
      {15, 13, 2, 5},
      {14, 3, 4, 1},
      {12, 6, 8, 9},
      {16, 7, 10, 11}
    };
    // rotate array
    target.rotate(input);
    Assertions.assertArrayEquals(expected, input);
  }
}
