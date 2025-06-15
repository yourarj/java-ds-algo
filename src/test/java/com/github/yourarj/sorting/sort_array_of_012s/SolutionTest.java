package com.github.yourarj.sorting.sort_array_of_012s;

import com.github.yourarj.gfg_amzn_sde_dsa.sorting.sort_array_of_012s.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void sort012Test_01() {
    final int[] input = {0, 1, 2, 0, 1, 2};
    final int[] output = {0, 0, 1, 1, 2, 2};
    Solution.sort012(input);
    Assertions.assertArrayEquals(input, output);
  }

  @Test
  void sort012Test_02() {
    final int[] input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    final int[] output = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
    Solution.sort012(input);
    Assertions.assertArrayEquals(input, output);
  }

  @Test
  void sort012Test_03() {
    final int[] input = {0, 1, 2};
    final int[] output = {0, 1, 2};
    Solution.sort012(input);
    Assertions.assertArrayEquals(input, output);
  }

  @Test
  void sort012Test_04() {
    final int[] input = {1, 0};
    final int[] output = {0, 1};
    Solution.sort012(input);
    Assertions.assertArrayEquals(input, output);
  }

  @Test
  void sort012Test_05() {
    final int[] input = {0};
    final int[] output = {0};
    Solution.sort012(input);
    Assertions.assertArrayEquals(input, output);
  }
}
