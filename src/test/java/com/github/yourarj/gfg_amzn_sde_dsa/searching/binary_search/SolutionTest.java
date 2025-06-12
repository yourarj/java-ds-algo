package com.github.yourarj.gfg_amzn_sde_dsa.searching.binary_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void search_Test_01() {
    final int[] input = {1, 2, 4, 5, 6, 8, 9, 10};
    final int key = 8;
    final int expected = 5;
    final int actual = Solution.binarySearch(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_02() {
    final int[] input = {1, 2, 3, 4};
    final int key = 6;
    final int expected = -1;
    final int actual = Solution.binarySearch(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_03() {
    final int[] input = {33, 42, 72, 99};
    final int key = 42;
    final int expected = 1;
    final int actual = Solution.binarySearch(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_04() {
    final int[] input = {33, 42, 72, 99, 101, 105, 108, 110, 115, 150, 151};
    final int key = 151;
    final int expected = 10;
    final int actual = Solution.binarySearch(input, key);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void search_Test_05() {
    final int[] input = {33, 42, 72, 99, 101, 105, 108, 110, 115, 150, 151, 151, 151, 151, 151, 151, 151};
    final int key = 151;
    final int expected = 12;
    final int actual = Solution.binarySearch(input, key);
    Assertions.assertEquals(expected, actual);
  }
}
