package com.github.yourarj.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchMountainArrayTest {

  @Test
  void searchInMountainNormalCase() {
    SearchMountainArray target = new SearchMountainArray();
    int needle = 5;
    int[] haystack = {0, 1, 2, 6, 5, 3};
    int expectedOutput = 4;
    int actualOutput = target.search(needle, haystack);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void searchInMountainInSmalledPossibleMountain() {
    SearchMountainArray target = new SearchMountainArray();
    int needle = 3;
    int[] haystack = {2,6, 5, 3};
    int expectedOutput = 3;
    int actualOutput = target.search(needle, haystack);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }
}
