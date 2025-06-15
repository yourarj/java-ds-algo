package com.github.yourarj.gfg_amzn_sde_dsa.sorting.inversion_count;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void inversionCountTest_01() {
    final int[] input = {4, 3, 2, 1};
    final int expected = 6;
    final int actual = Solution.inversionCount(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void inversionCountTest_02() {
    final int[] input = {4, 1, 2, 3};
    final int expected = 3;
    final int actual = Solution.inversionCount(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void inversionCountTest_03() {
    final int[] input = {1, 2, 3, 4, 5, 6};
    final int expected = 0;
    final int actual = Solution.inversionCount(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void inversionCountTest_04() {
    final int[] input = {10, 10, 10};
    final int expected = 0;
    final int actual = Solution.inversionCount(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void inversionCountTest_05() {
    final int[] input = {10, 9, 1, 2, 3, 4, 5, 6, 7, 8};
    final int expected = 17;
    final int actual = Solution.inversionCount(input);
    Assertions.assertEquals(expected, actual);
  }
}
