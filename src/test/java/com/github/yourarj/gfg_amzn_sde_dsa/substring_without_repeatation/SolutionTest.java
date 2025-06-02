package com.github.yourarj.gfg_amzn_sde_dsa.substring_without_repeatation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void longestUniqueSubString_Test_01() {
    final String input = "geeksforgeeks";
    final int expected = 7;
    final int actual = Solution.longestUniqueSubString(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void longestUniqueSubString_Test_02() {
    final String input = "aaa";
    final int expected = 1;
    final int actual = Solution.longestUniqueSubString(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void longestUniqueSubString_Test_03() {
    final String input = "abcdefabcbb";
    final int expected = 6;
    final int actual = Solution.longestUniqueSubString(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void longestUniqueSubString_Test_04() {
    final String input = "abcefghijk";
    final int expected = 10;
    final int actual = Solution.longestUniqueSubString(input);
    Assertions.assertEquals(expected, actual);
  }
}
