package com.github.yourarj.leetcode_top_interview_150.longestsubstringwitoutrepeatchar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void name01() {
    String input = "asadfawefawfvaysrhdudthdrhr";
    // as
    // adf
    // awef
    // awfv
    // aysrhdu
    // dth
    // drhr
    int expected = 10;
    int actual = target.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void name02() {
    String input = "dvdf";
    int expected = 3;
    int actual = target.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void name03() {
    String input = "tmmzuxt";
    int expected = 5;
    int actual = target.lengthOfLongestSubstring(input);
    Assertions.assertEquals(expected, actual);
  }
}
