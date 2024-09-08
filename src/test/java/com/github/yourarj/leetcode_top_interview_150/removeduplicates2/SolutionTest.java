package com.github.yourarj.leetcode_top_interview_150.removeduplicates2;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void removeDuplicates() {
    int[] input = {1, 1, 1, 2, 2, 3};
    int[] expected = {1, 1, 2, 2, 3};
    int k = target.removeDuplicates(input);
    Assertions.assertArrayEquals(expected, Arrays.copyOfRange(input, 0, k));
  }

  @Test
  void removeDuplicates02() {
    int[] input = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    int[] expected = {0, 0, 1, 1, 2, 3, 3};
    int k = target.removeDuplicates(input);
    Assertions.assertArrayEquals(expected, Arrays.copyOfRange(input, 0, k));
  }

  @Test
  void removeDuplicates03() {
    int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] expected = {0, 0};
    int k = target.removeDuplicates(input);
    Assertions.assertArrayEquals(expected, Arrays.copyOfRange(input, 0, k));
  }

  @Test
  void removeDuplicates04() {
    int[] input = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    int[] expected = {0, 0, 1};
    int k = target.removeDuplicates(input);
    Assertions.assertArrayEquals(expected, Arrays.copyOfRange(input, 0, k));
  }
}
