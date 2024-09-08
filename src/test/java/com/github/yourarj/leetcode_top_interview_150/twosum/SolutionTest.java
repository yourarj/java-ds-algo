package com.github.yourarj.leetcode_top_interview_150.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void twoSum01() {
    int[] input = {2, 7, 11, 15};
    int[] expected = {0, 1};
    int[] actual = target.twoSum(input, 9);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void twoSum02() {
    int[] input = {2, 3, 4};
    int[] expected = {0, 2};
    int[] actual = target.twoSum(input, 6);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void twoSum03() {
    int[] input = {-1, 0};
    int[] expected = {0, 1};
    int[] actual = target.twoSum(input, -1);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void twoSum04() {
    int[] input = {-2, -1, 0, 4, 5, 100, 102};
    int[] expected = {0, 4};
    int[] actual = target.twoSum(input, 3);
    Assertions.assertArrayEquals(expected, actual);
  }
}
