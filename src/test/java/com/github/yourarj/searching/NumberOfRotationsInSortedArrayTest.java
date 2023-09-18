package com.github.yourarj.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfRotationsInSortedArrayTest {
  private final NumberOfRotationsInSortedArray target = new NumberOfRotationsInSortedArray();

  @Test
  void numberOfRotations() {
    int[] array = {0, 1, 2, 3, -1};
    Assertions.assertEquals(4, target.numberOfRotations(array));
  }

  @Test
  void numberOfRotationsRegularArray() {
    int[] array = {0, 1, 2, 3};
    Assertions.assertEquals(0, target.numberOfRotations(array));
  }
}
