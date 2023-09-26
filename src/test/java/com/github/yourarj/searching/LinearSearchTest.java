package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {
  private final LinearSearch<Integer> target = new LinearSearch<>();

  @org.junit.jupiter.api.Test
  void linearSearch() {
    Integer[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.linearSearch(555, arr);

    assertEquals(6, position);
  }

  @org.junit.jupiter.api.Test
  void linearSearchNonExistentItem() {
    Integer[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.linearSearch(556, arr);

    assertEquals(-1, position);
  }

  @org.junit.jupiter.api.Test
  void linearSearchInMixedNumber() {
    Integer[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962};
    int position = target.linearSearch(10, arr);

    assertEquals(5, position);
  }

  @org.junit.jupiter.api.Test
  void linearSearchInEmptyArray() {
    Integer[] arr = {};
    int position = target.linearSearch(10, arr);

    assertEquals(-1, position);
  }
}
