package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindElementPositionInInfiniteSortedArrayTest {

  @Test
  void findPosition() {
    SearchInfiniteSortedArray findInInfinite =
        new SearchInfiniteSortedArray();
    int inputElement = 15;
    int[] inputArray = {
      0, 2, 3, 4, 6, 7, 9, 12, 13, 15, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
      33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55
    };

    int output = findInInfinite.findPosition(inputElement, inputArray);

    assertEquals(9, output);
  }

  @Test
  void findPositionFirstElement() {
    SearchInfiniteSortedArray findInInfinite =
        new SearchInfiniteSortedArray();
    int inputElement = 0;
    int[] inputArray = {
      0, 2, 3, 4, 6, 7, 9, 12, 13, 15, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
      33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55
    };

    int output = findInInfinite.findPosition(inputElement, inputArray);

    assertEquals(0, output);
  }
}
