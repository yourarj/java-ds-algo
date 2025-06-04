package com.github.yourarj.gfg_amzn_sde_dsa.look_and_say_sequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void nextTerm_Test_01() {
    final int input = 3;
    final String expected = "21";
    final String actual = Solution.nextTerm(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nextTerm_Test_02() {
    final int input = 4;
    final String expected = "1211";
    final String actual = Solution.nextTerm(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nextTerm_Test_03() {
    final int input = 2;
    final String expected = "11";
    final String actual = Solution.nextTerm(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nextTerm_Test_04() {
    final int input = 1;
    final String expected = "1";
    final String actual = Solution.nextTerm(input);
    Assertions.assertEquals(expected, actual);
  }
}
