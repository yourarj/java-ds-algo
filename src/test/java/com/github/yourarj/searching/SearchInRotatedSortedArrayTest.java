package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

  @Test
  void searchInHappyPathScenario() {
    int needle = 5;
    int[] haystack = {6, 7, 8, 9, 10, 12, 0, 2, 5};
    int expectedOutput = haystack.length - 1;

    SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    int actualOutput = search.search(needle, haystack);

    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchInHappyPathScenarioWhereNeedleIsFirst() {
    int needle = 6;
    int[] haystack = {6, 7, 8, 9, 10, 12, 0, 2, 5};
    int expectedOutput = 0;

    SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    int actualOutput = search.search(needle, haystack);

    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchInSmallestArray() {
    int needle = 12;
    int[] haystack = {11};
    int expectedOutput = -1;

    SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    int actualOutput = search.search(needle, haystack);

    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchInInNTimeRotatedArray() {
    int needle = 13;
    int[] haystack = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22};
    int expectedOutput = 2;

    SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    int actualOutput = search.search(needle, haystack);

    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchAndAllElementFoundInRotatedArray() {
    SearchInRotatedSortedArray target = new SearchInRotatedSortedArray();
    int[] haystack = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 0, 2, 5, 6};

    assertEquals(0, target.search(11, haystack));
    assertEquals(1, target.search(12, haystack));
    assertEquals(2, target.search(13, haystack));
    assertEquals(3, target.search(14, haystack));
    assertEquals(4, target.search(15, haystack));
    assertEquals(5, target.search(16, haystack));
    assertEquals(6, target.search(17, haystack));
    assertEquals(7, target.search(18, haystack));
    assertEquals(8, target.search(19, haystack));
    assertEquals(9, target.search(20, haystack));
    assertEquals(10, target.search(22, haystack));
    assertEquals(11, target.search(0, haystack));
    assertEquals(12, target.search(2, haystack));
    assertEquals(13, target.search(5, haystack));
    assertEquals(14, target.search(6, haystack));
  }
}
