package com.github.yourarj.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CycleSortTest {

  private final CycleSort target = new CycleSort();

  @Test
  void cycleSortArrayHappyPath() {
    int[] input = {8, 7, 6, 5, 4, 3, 2, 1};
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

    // perform bubble sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void cycleSortEmptyArray() {
    int[] input = {};
    int[] expected = {};

    // perform bubble sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void cycleSortOneElementArray() {
    int[] input = {1};
    int[] expected = {1};

    // perform bubble sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void cycleSortTwoElementArray() {
    int[] input = {2, 1};
    int[] expected = {1, 2};

    // perform bubble sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }
}
