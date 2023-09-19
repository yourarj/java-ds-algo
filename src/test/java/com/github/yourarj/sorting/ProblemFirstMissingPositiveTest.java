package com.github.yourarj.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProblemFirstMissingPositiveTest {
  private final ProblemFirstMissingPositive target = new ProblemFirstMissingPositive();

  @Test
  void firstMissingPositiveCase01() {
    int[] input = {1, 2, 0};
    int expectedResult = 3;
    int actualResult = target.firstMissingPositive(input);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @Test
  void firstMissingPositiveCase02() {
    int[] input = {3, 4, -1, 1};
    int expectedResult = 2;
    int actualResult = target.firstMissingPositive(input);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @Test
  void firstMissingPositiveCase03() {
    int[] input = {7, 8, 9, 11, 12};
    int expectedResult = 1;
    int actualResult = target.firstMissingPositive(input);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @Test
  void firstMissingPositiveCase04() {
    int[] input = {1};
    int expectedResult = 2;
    int actualResult = target.firstMissingPositive(input);
    Assertions.assertEquals(expectedResult, actualResult);
  }

  @Test
  void firstMissingPositiveCase05() {
    int[] input = {1, 1};
    int expectedResult = 2;
    int actualResult = target.firstMissingPositive(input);
    Assertions.assertEquals(expectedResult, actualResult);
  }
}
