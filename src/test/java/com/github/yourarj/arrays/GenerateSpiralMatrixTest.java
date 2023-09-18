package com.github.yourarj.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenerateSpiralMatrixTest {
  private final GenerateSpiralMatrix target = new GenerateSpiralMatrix();

  @Test
  void generateMatrixCase01() {
    int n = 3;
    int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
    int[][] actual = target.generateMatrix(n);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void generateMatrixCase02() {
    int n = 1;
    int[][] expected = {{1}};
    int[][] actual = target.generateMatrix(n);
    Assertions.assertArrayEquals(expected, actual);
  }
}
