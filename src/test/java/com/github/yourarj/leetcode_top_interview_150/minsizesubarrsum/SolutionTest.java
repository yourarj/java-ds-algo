package com.github.yourarj.leetcode_top_interview_150.minsizesubarrsum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void minSubArrayLen01() {
    int[] input = {2, 3, 1, 2, 4, 3};
    int expected = 2;
    int actual = target.minSubArrayLen(7, input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void minSubArrayLen02() {
    int[] input = {1, 4, 4};
    int expected = 1;
    int actual = target.minSubArrayLen(4, input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void minSubArrayLen03() {
    int[] input = {1, 1, 1, 1, 1, 1, 1, 1};
    int expected = 0;
    int actual = target.minSubArrayLen(11, input);
    Assertions.assertEquals(expected, actual);
  }
}
