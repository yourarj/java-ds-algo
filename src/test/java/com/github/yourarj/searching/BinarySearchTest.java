package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
  private final BinarySearch<Integer> target = new BinarySearch<>();

  @Test
  void binarySearch() {
    Integer[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.binarySearch(555, arr);

    assertEquals(6, position);
  }

  @Test
  void binarySearchNonExistentItem() {
    Integer[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.binarySearch(4, arr);

    assertEquals(-1, position);
  }

  @Test
  void binarySearchInMixedNumber() {
    Integer[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962};
    int position = target.binarySearch(10, arr);

    assertEquals(5, position);
  }

  @Test
  void binarySearchFindMiddleElement() {
    Integer[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962, 1024};
    int position = target.binarySearch(10, arr);

    assertEquals(5, position);
  }

  @Test
  void binarySearchFindLastMiddleElement() {
    Integer[] arr = {3, 4};
    int position = target.binarySearch(4, arr);

    assertEquals(1, position);
  }

  @Test
  void binarySearchInEmptyArray() {
    Integer[] arr = {};
    int position = target.binarySearch(10, arr);

    assertEquals(-1, position);
  }
}
