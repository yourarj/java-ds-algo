package com.github.yourarj.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {
  private final SetMatrixZeroes target = new SetMatrixZeroes();

  @Test
  void setZeroesUseCase01() {
    int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
    target.setZeroes(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void setZeroesUseCase02() {
    int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
    target.setZeroes(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void setZeroesUseCase03() {
    int[][] input = {{0, 1}};
    int[][] expected = {{0, 0}};
    target.setZeroes(input);
    Assertions.assertArrayEquals(expected, input);
  }
}
