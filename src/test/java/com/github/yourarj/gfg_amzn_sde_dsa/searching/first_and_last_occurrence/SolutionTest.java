package com.github.yourarj.gfg_amzn_sde_dsa.searching.first_and_last_occurrence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

  @Test
  void findFirstAndLastOccurrence_Test_01() {
    final int[] haystack = {1, 3, 5, 5, 5, 5, 67, 123, 125};
    final int needle = 5;
    final List<Integer> expected = List.of(2, 5);
    final List<Integer> actual = Solution.findFirstAndLastOccurrence(haystack, needle);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void findFirstAndLastOccurrence_Test_02() {
    final int[] haystack = {1, 3, 5, 5, 5, 5, 7, 123, 125};
    final int needle = 7;
    final List<Integer> expected = List.of(6, 6);
    final List<Integer> actual = Solution.findFirstAndLastOccurrence(haystack, needle);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void findFirstAndLastOccurrence_Test_03() {
    final int[] haystack = {1, 2, 3, 4};
    final int needle = 5;
    final List<Integer> expected = List.of(-1, -1);
    final List<Integer> actual = Solution.findFirstAndLastOccurrence(haystack, needle);
    Assertions.assertIterableEquals(expected, actual);
  }
}
