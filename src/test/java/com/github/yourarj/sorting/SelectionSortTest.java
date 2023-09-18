package com.github.yourarj.sorting;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
  private final SelectionSort target = new SelectionSort();

  @Test
  void bubbleSortArrayHappyPath() {
    int[] input = {8, 7, 6, 5, 4, 3, 2, 1};
    int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

    // perform selection sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void bubbleSortEmptyArray() {
    int[] input = {};
    int[] expected = {};

    // perform selection sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void bubbleSortOneElementArray() {
    int[] input = {8};
    int[] expected = {8};

    // perform selection sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void bubbleSortTwoElementArray() {
    int[] input = {8, 2};
    int[] expected = {2, 8};

    // perform selection sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }

  @Test
  void bubbleSortArrayWithNegativeElements() {
    int[] input = {8, 2, -300, -1, 1, 0, -155};
    int[] expected = {-300, -155, -1, 0, 1, 2, 8};

    // perform selection sort on array
    target.sort(input);
    Assertions.assertArrayEquals(expected, input);
  }
}
