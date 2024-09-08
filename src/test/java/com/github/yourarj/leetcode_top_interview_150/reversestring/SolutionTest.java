package com.github.yourarj.leetcode_top_interview_150.reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void reverseWords01() {
    final String input = "the sky is blue";
    final String expected = "blue is sky the";
    final String actual = target.reverseWords(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void reverseWords02() {
    final String input = "  hello world  ";
    final String expected = "world hello";
    final String actual = target.reverseWords(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void reverseWords03() {
    final String input = "a good   example";
    final String expected = "example good a";
    final String actual = target.reverseWords(input);
    Assertions.assertEquals(expected, actual);
  }
}

// PAYPALISHIRING
