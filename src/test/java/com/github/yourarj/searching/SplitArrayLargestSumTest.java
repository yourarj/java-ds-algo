package com.github.yourarj.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitArrayLargestSumTest {
  SplitArrayLargestSum target = new SplitArrayLargestSum();

  @Test
  void splitArrayCase01() {
    int[] nums = {7, 2, 5, 10, 8};
    int k = 2;
    int expectedResult = 18;
    int actualResult = target.splitArray(nums, k);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  void splitArrayCase02() {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 2;
    int expectedResult = 9;
    int actualResult = target.splitArray(nums, k);
    assertEquals(expectedResult, actualResult);
  }
}
