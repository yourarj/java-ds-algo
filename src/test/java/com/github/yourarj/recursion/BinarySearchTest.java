package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
  private final BinarySearch target = new BinarySearch();

  @org.junit.jupiter.api.Test
  void binarySearch() {
    int[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.search(555, arr);
    assertEquals(6, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchNonExistentItem() {
    int[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.search(4, arr);
    assertEquals(-1, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchInMixedNumber() {
    int[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962};
    int position = target.search(10, arr);
    assertEquals(5, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchFindMiddleElement() {
    int[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962, 1024};
    int position = target.search(10, arr);
    assertEquals(5, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchFindLastMiddleElement() {
    int[] arr = {3, 4};
    int position = target.search(4, arr);
    assertEquals(1, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchInEmptyArray() {
    int[] arr = {};
    int position = target.search(10, arr);
    assertEquals(-1, position);
  }
}
