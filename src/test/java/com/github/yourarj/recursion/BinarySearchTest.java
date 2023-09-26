package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {
  private final BinarySearch target = new BinarySearch();

  @Test
  void binarySearch() {
    int[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.search(555, arr);
    assertEquals(6, position);
  }

  @Test
  void binarySearchNonExistentItem() {
    int[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    int position = target.search(4, arr);
    assertEquals(-1, position);
  }

  @Test
  void binarySearchInMixedNumber() {
    int[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962};
    int position = target.search(10, arr);
    assertEquals(5, position);
  }

  @Test
  void binarySearchFindMiddleElement() {
    int[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962, 1024};
    int position = target.search(10, arr);
    assertEquals(5, position);
  }

  @Test
  void binarySearchFindLastMiddleElement() {
    int[] arr = {3, 4};
    int position = target.search(4, arr);
    assertEquals(1, position);
  }

  @Test
  void binarySearchInEmptyArray() {
    int[] arr = {};
    int position = target.search(10, arr);
    assertEquals(-1, position);
  }
}
