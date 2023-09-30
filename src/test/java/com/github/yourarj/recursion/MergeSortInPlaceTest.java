package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortInPlaceTest {
  private final MergeSortInPlace target = new MergeSortInPlace();

  @Test
  void sortEmptyArray() {
    int[] input = {};
    int[] expected = {};
    // perform sorting
    target.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void sortArrayWithOneElement() {
    int[] input = {3};
    int[] expected = {3};
    // perform sorting
    target.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void sortAllPositives() {
    int[] input = {6, 8, 9, 3, 27, 1, 55, 98, 632};
    int[] expected = {1, 3, 6, 8, 9, 27, 55, 98, 632};
    // perform sorting
    target.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void sortAllNegatives() {
    int[] input = {-6, -8, -9, -3, -27, -1, -55, -98, -632};
    int[] expected = {-632, -98, -55, -27, -9, -8, -6, -3, -1};
    // perform sorting
    target.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void sortMixedNumbers() {
    int[] input = {240000, 584, -2, 9528, 63, 1, 0, -15};
    int[] expected = {-15, -2, 0, 1, 63, 584, 9528, 240000};
    // perform sorting
    target.sort(input);
    assertArrayEquals(expected, input);
  }

  @Test
  void sortArrayOfThreeNumbers() {
    int[] input = {3, 2, 1};
    int[] expected = {1, 2, 3};
    // perform sorting
    target.sort(input);
    assertArrayEquals(expected, input);
  }
}
