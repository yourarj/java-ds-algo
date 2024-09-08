package com.github.yourarj.leetcode_top_interview_150.inttoroman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void intToRoman01() {
    int input = 3749;
    String expected = target.intToRoman(input);
    String actual = "MMMDCCXLIX";
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void intToRoman02() {
    int input = 58;
    String expected = target.intToRoman(input);
    String actual = "LVIII";
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void intToRoman03() {
    int input = 1994;
    String expected = target.intToRoman(input);
    String actual = "MCMXCIV";
    Assertions.assertEquals(expected, actual);
  }
}
