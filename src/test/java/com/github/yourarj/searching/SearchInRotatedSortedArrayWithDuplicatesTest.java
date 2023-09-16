package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayWithDuplicatesTest {

  @Test
  void searchInHappyPathScenario() {
    int needle = 5;
    int[] haystack = {6, 7, 8, 9, 10, 12, 0, 2, 5};
    int expectedOutput = haystack.length - 1;

    SearchInRotatedSortedArrayWithDuplicates search =
        new SearchInRotatedSortedArrayWithDuplicates();

    int actualOutput = search.search(needle, haystack);

    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchInHappyPathScenarioWhereNeedleIsFirst() {
    int[] haystack = {6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 12, 0, 2, 5};

    SearchInRotatedSortedArrayWithDuplicates search =
        new SearchInRotatedSortedArrayWithDuplicates();

    assertEquals(0, search.search(6, haystack));
    assertEquals(1, search.search(7, haystack));
    assertEquals(2, search.search(8, haystack));
    assertEquals(3, search.search(9, haystack));
    //    assertEquals(4, search.search(10, haystack));
    assertEquals(12, search.search(12, haystack));
    assertEquals(13, search.search(0, haystack));
    assertEquals(14, search.search(2, haystack));
    assertEquals(15, search.search(5, haystack));
  }

  @Test
  void searchInArrayWithOnlyOneUnique() {
    int[] haystack = {10, 10, 10, 10, 10, 10, 10, 10, 12, 10};
    int[] haystack2 = {10, 12, 10};

    SearchInRotatedSortedArrayWithDuplicates search =
        new SearchInRotatedSortedArrayWithDuplicates();

    assertEquals(8, search.search(12, haystack));
    assertEquals(1, search.search(12, haystack2));
  }
}
