package com.github.yourarj.leetcode_top_interview_150.buysellstock2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void maxProfit01() {
    int[] input = {7, 1, 5, 3, 6, 4};
    int expected = 7;
    int actual = target.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void maxProfit02() {
    int[] input = {1, 2, 3, 4, 5};
    int expected = 4;
    int actual = target.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void maxProfit03() {
    int[] input = {1, 2, 3, 4, 5, 0, 10};
    int expected = 14;
    int actual = target.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void maxProfit04() {
    int[] input = {1, 30};
    int expected = 29;
    int actual = target.maxProfit(input);
    Assertions.assertEquals(expected, actual);
  }
}
