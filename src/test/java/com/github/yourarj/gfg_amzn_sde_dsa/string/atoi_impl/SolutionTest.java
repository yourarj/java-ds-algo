package com.github.yourarj.gfg_amzn_sde_dsa.string.atoi_impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void myAtoi_Test_01() {
    final String input = "-123";
    final int expected = -123;
    final int actual = Solution.myAtoi(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void myAtoi_Test_02() {
    final String input = "-";
    final int expected = 0;
    final int actual = Solution.myAtoi(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void myAtoi_Test_03() {
    final String input = "1231231231311133";
    final int expected = 2147483647;
    final int actual = Solution.myAtoi(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void myAtoi_Test_04() {
    final String input = "-999999999999";
    final int expected = -2147483648;
    final int actual = Solution.myAtoi(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void myAtoi_Test_05() {
    final String input = "-0012gfg4";
    final int expected = -12;
    final int actual = Solution.myAtoi(input);
    Assertions.assertEquals(expected, actual);
  }

}
