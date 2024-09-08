package com.github.yourarj.leetcode_top_interview_150.threesum;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void threeSum01() {
    int[] input = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
    List<List<Integer>> actual = target.threeSum(input);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void threeSum02() {
    int[] input = {0, 1, 1};
    List<List<Integer>> expected = List.of();
    List<List<Integer>> actual = target.threeSum(input);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void threeSum03() {
    int[] input = {0, 0, 0};
    List<List<Integer>> expected = List.of(List.of(0, 0, 0));
    List<List<Integer>> actual = target.threeSum(input);
    Assertions.assertIterableEquals(expected, actual);
  }
}
