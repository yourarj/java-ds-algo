package com.github.yourarj.leetcode_top_interview_150.binaryaddition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void addBinary01() {
    String inputA = "1010";
    String inputB = "1011";
    String expected = "10101";
    String actual = target.addBinary(inputA, inputB);
    assertEquals(expected, actual);
  }

  @Test
  void addBinary02() {
    String inputA = "11";
    String inputB = "1";
    String expected = "100";
    String actual = target.addBinary(inputA, inputB);
    assertEquals(expected, actual);
  }

  @Test
  void addBinary03() {
    String inputA = "10";
    String inputB = "1";
    String expected = "11";
    String actual = target.addBinary(inputA, inputB);
    assertEquals(expected, actual);
  }
}
