package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

  @org.junit.jupiter.api.Test
  void binarySearch() {
    Integer[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    BinarySearch<Integer> searcher = new BinarySearch<>();

    int position = searcher.binarySearch(555, arr);

    assertEquals(6, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchNonExistentItem() {
    Integer[] arr = {1, 2, 3, 8, 10, 100, 555, 563, 962};
    BinarySearch<Integer> searcher = new BinarySearch<>();

    int position = searcher.binarySearch(4, arr);

    assertEquals(-1, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchInMixedNumber() {
    Integer[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962};
    BinarySearch<Integer> searcher = new BinarySearch<>();

    int position = searcher.binarySearch(10, arr);

    assertEquals(5, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchFindMiddleElement() {
    Integer[] arr = {-125, -1, -12, 3, 8, 10, 100, 555, 563, 962, 1024};
    BinarySearch<Integer> searcher = new BinarySearch<>();

    int position = searcher.binarySearch(10, arr);

    assertEquals(5, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchFindLastMiddleElement() {
    Integer[] arr = {3, 4};
    BinarySearch<Integer> searcher = new BinarySearch<>();

    int position = searcher.binarySearch(4, arr);

    assertEquals(1, position);
  }

  @org.junit.jupiter.api.Test
  void binarySearchInEmptyArray() {
    Integer[] arr = {};
    BinarySearch<Integer> searcher = new BinarySearch<>();

    int position = searcher.binarySearch(10, arr);

    assertEquals(-1, position);
  }
}
