package com.github.yourarj.leetcode_top_interview_150.prob_200_number_of_islands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  final Solution target = new Solution();

  @Test
  void numIslands_01() {
    final char[][] grid = {
      {'1', '1', '1', '1', '0'},
      {'1', '1', '0', '1', '0'},
      {'1', '1', '0', '0', '0'},
      {'0', '0', '0', '0', '0'}
    };

    final int expected = 1;
    final int actual = target.numIslands(grid);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void numIslands_02() {
    final char[][] grid = {
      {'1', '1', '1', '1', '0'},
      {'1', '1', '0', '1', '0'},
      {'1', '1', '0', '0', '0'},
      {'0', '0', '0', '0', '0'}
    };
    final int expected = 1;
    final int actual = target.numIslands(grid);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void numIslands_03() {
    final char[][] grid = {
      {'1', '0'},
      {'0', '1'}
    };
    final int expected = 2;
    final int actual = target.numIslands(grid);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void numIslands_04() {
    final char[][] grid = {
      {'1', '1', '0', '1', '0'},
      {'1', '1', '0', '1', '0'},
      {'1', '1', '0', '0', '0'},
      {'0', '0', '1', '0', '1'}
    };
    final int expected = 4;
    final int actual = target.numIslands(grid);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void numIslands_05() {
    final char[][] grid = {{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};
    final int expected = 1;
    final int actual = target.numIslands(grid);
    Assertions.assertEquals(expected, actual);
  }
}
