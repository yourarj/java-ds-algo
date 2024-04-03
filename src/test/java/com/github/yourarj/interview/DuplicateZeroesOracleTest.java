package com.github.yourarj.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateZeroesOracleTest {
  private final DuplicateZeroesOracle target = new DuplicateZeroesOracle();

  @Test
  void duplicateZeroesCase01() {
    final int[] input = new int[] {1, 0, 2, 0, 0, 3, 4, 5};
    final int[] expected = new int[] {1, 0, 0, 2, 0, 0, 0, 0};
    target.duplicateZeroes(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void duplicateZeroesCase02() {
    final int[] input = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
    final int[] expected = new int[] {1, 0, 0, 2, 3, 0, 0, 4};
    target.duplicateZeroes(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void duplicateZeroesCase03() {
    final int[] input = new int[] {1, 2, 3};
    final int[] expected = new int[] {1, 2, 3};
    target.duplicateZeroes(input);
    assertArrayEquals(expected, input);
  }
}
