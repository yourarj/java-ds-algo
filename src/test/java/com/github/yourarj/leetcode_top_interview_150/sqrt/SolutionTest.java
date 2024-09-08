package com.github.yourarj.leetcode_top_interview_150.sqrt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void mySqrt01() {
    int input = 2147395599;
    int expected = 46339;
    int actual = target.mySqrt(input);
    assertEquals(expected, actual);
  }

  @Test
  void mySqrt02() {
    int input = 8;
    int expected = 2;
    int actual = target.mySqrt(input);
    assertEquals(expected, actual);
  }

  @Test
  void mySqrt03() {
    int input = 155;
    int expected = 12;
    int actual = target.mySqrt(input);
    assertEquals(expected, actual);
  }

  @Test
  void mySqrt04() {
    int input = 500;
    int expected = 22;
    int actual = target.mySqrt(input);
    assertEquals(expected, actual);
  }
}
