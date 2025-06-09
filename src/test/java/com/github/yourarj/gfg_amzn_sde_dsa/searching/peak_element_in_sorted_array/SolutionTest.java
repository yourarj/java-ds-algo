package com.github.yourarj.gfg_amzn_sde_dsa.searching.peak_element_in_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void peakElementTest01() {
    final int[] arr = {1, 2, 4, 5, 7, 8, 0};
    final int expected = 5;
    final int actual = Solution.peakElement(arr);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void peakElementTest02() {
    final int[] arr = {10, 20, 15, 2, 23, 90, 80};
    final int expected1 = 1;
    final int expected2 = 5;
    final int actual = Solution.peakElement(arr);
    Assertions.assertTrue(actual == expected1 || actual == expected2);
  }

  @Test
  void peakElementTest03() {
    final int[] arr = {1, 2, 3, 4, 5, 6};
    final int expected = 5;
    final int actual = Solution.peakElement(arr);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void peakElementTest04() {
    final int[] arr = {7, 8, 1, 2, 3, 4, 5, 6};
    final int expected1 = 1;
    final int expected2 = 7;
    final int actual = Solution.peakElement(arr);
    Assertions.assertTrue(expected1 == actual || expected2 == actual);
  }
}
