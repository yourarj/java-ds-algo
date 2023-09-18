package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SplitArrayLargestSumTest {
  private final SplitArrayLargestSum target = new SplitArrayLargestSum();

  @Test
  void splitArrayCase01() {
    int[] numbers = {7, 2, 5, 10, 8};
    int k = 2;
    int expectedResult = 18;
    int actualResult = target.splitArray(numbers, k);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void splitArrayCase02() {
    int[] numbers = {1, 2, 3, 4, 5};
    int k = 2;
    int expectedResult = 9;
    int actualResult = target.splitArray(numbers, k);
    assertEquals(expectedResult, actualResult);
  }
}
