package com.github.yourarj.gfg_amzn_sde_dsa.searching.search_in_sorted_rotated_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void search_Test_01() {
    final int[] input = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    final int key = 3;
    final int expected = 8;
    final int actual = Solution.search(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_02() {
    final int[] input = {3, 5, 1, 2};
    final int key = 6;
    final int expected = -1;
    final int actual = Solution.search(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_03() {
    final int[] input = {33, 42, 72, 99};
    final int key = 42;
    final int expected = 1;
    final int actual = Solution.search(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_04() {
    final int[] input = {151, 33, 42, 72, 99, 101, 105, 108, 110, 115, 150};
    final int key = 151;
    final int expected = 0;
    final int actual = Solution.search(input, key);
    Assertions.assertEquals(expected, actual);
  }
}
