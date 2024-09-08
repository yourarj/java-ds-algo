package com.github.yourarj.leetcode_top_interview_150.hindex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void hIndex01() {
    int[] input = {1};
    int expected = 1;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex02() {
    int[] input = {1, 1, 1, 1};
    int expected = 1;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex03() {
    int[] input = {7, 7, 7, 7};
    int expected = 4;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex04() {
    int[] input = {9, 9, 8, 8, 7, 7, 6, 6, 5};
    int expected = 6;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex05() {
    int[] input = {1, 3, 1};
    int expected = 1;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex06() {
    int[] input = {
      0, 0, 0, 0, 0, 9, 9, 9, 7, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 9, 9, 9, 7, 7, 1,
      1, 1, 1, 1, 1, 1, 1, 1, 1
    };
    int expected = 7;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex07() {
    int[] input = {
      0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 3, 7, 7, 7, 8, 8, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6
    };
    int expected = 6;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex08() {
    int[] input = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 3, 5, 5, 2, 5};
    int expected = 4;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex09() {
    int[] input = {3, 0, 6, 1, 5};
    int expected = 3;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex10() {
    int[] input = {3, 0, 6, 1, 5, 3, 0, 6, 1, 5};
    int expected = 4;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void hIndex11() {
    int[] input = {7, 7, 7, 8, 8};
    int expected = 5;
    int actual = target.hIndex(input);
    Assertions.assertEquals(expected, actual);
  }
}
