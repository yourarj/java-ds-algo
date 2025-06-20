package com.github.yourarj.gfg_amzn_sde_dsa.sorting.kth_element_merged_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void kthElementTest_01() {
    final int[] a = {2, 3, 6, 7, 9}, b = {1, 4, 8, 10};
    final int k = 5;
    final int expected = 6;
    final int actual = Solution.kthElement(a, b, k);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void kthElementTest_02() {
    final int[] a = {100, 112, 256, 349, 770}, b = {72, 86, 113, 119, 265, 445, 892};
    final int k = 7;
    final int expected = 256;
    final int actual = Solution.kthElement(a, b, k);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void kthElementTest_03() {
    final int[] a = {}, b = {72, 86, 113, 119, 265, 445, 892};
    final int k = 7;
    final int expected = 892;
    final int actual = Solution.kthElement(a, b, k);
    Assertions.assertEquals(expected, actual);
  }
}
