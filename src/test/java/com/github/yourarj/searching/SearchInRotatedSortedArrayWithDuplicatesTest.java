package com.github.yourarj.searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayWithDuplicatesTest {
  private final SearchInRotatedSortedArrayWithDuplicates target =
      new SearchInRotatedSortedArrayWithDuplicates();

  @Test
  void searchInHappyPathScenario() {
    int needle = 5;
    int[] haystack = {6, 7, 8, 9, 10, 12, 0, 2, 5};
    int expectedOutput = haystack.length - 1;
    int actualOutput = target.search(needle, haystack);

    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchInHappyPathScenarioWhereNeedleIsFirst() {
    int[] haystack = {6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 12, 0, 2, 5};
    assertEquals(0, target.search(6, haystack));
    assertEquals(1, target.search(7, haystack));
    assertEquals(2, target.search(8, haystack));
    assertEquals(3, target.search(9, haystack));
    //    assertEquals(4, target.search(10, haystack));
    assertEquals(12, target.search(12, haystack));
    assertEquals(13, target.search(0, haystack));
    assertEquals(14, target.search(2, haystack));
    assertEquals(15, target.search(5, haystack));
  }

  @Test
  void searchInArrayWithOnlyOneUnique() {
    int[] haystack = {10, 10, 10, 10, 10, 10, 10, 10, 12, 10};
    int[] haystack2 = {10, 12, 10};
    assertEquals(8, target.search(12, haystack));
    assertEquals(1, target.search(12, haystack2));
  }
}
