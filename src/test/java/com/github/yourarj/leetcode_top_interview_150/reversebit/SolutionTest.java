package com.github.yourarj.leetcode_top_interview_150.reversebit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void reverseBits() {
    int input = 0b00000010100101000001111010011100;
    int expected = 0b00111001011110000010100101000000;
    int actual = target.reverseBits(input);
    assertEquals(expected, actual);
  }
}
