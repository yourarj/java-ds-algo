package com.github.yourarj.gfg_amzn_sde_dsa.searching.median_of_two_sorted_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void medianOfTwoSortedArraysTest_01() {
    final int[] a = {-5, 3, 6, 12, 15}, b = {-12, -10, -6, -3, 4, 10};
    final double expected = 3;
    final double actual = Solution.medianOfTwoSortedArrays(a, b);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void medianOfTwoSortedArraysTest_02() {
    final int[] a = {1, 12, 15, 26, 38}, b = {2, 13, 17, 30, 45, 60};
    final double expected = 17;
    final double actual = Solution.medianOfTwoSortedArrays(a, b);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void medianOfTwoSortedArraysTest_03() {
    final int[] a = {}, b = {2, 4, 5, 6};
    final double expected = 4.5;
    final double actual = Solution.medianOfTwoSortedArrays(a, b);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void medianOfTwoSortedArraysTest_04() {
    final int[] a = {1, 2}, b = {3, 4, 5, 6};
    final double expected = 3.5;
    final double actual = Solution.medianOfTwoSortedArrays(a, b);
    Assertions.assertEquals(expected, actual);
  }
}
