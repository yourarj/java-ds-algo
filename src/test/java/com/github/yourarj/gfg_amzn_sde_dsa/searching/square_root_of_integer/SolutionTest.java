package com.github.yourarj.gfg_amzn_sde_dsa.searching.square_root_of_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void findSquareRoot_Test_01() {
    final int input = 4;
    final int expected = 2;
    final int actual = Solution.findSquareRoot(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findSquareRoot_Test_02() {
    final int input = 11;
    final int expected = 3;
    final int actual = Solution.findSquareRoot(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findSquareRoot_Test_03() {
    final int input = 625;
    final int expected = 25;
    final int actual = Solution.findSquareRoot(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findSquareRoot_Test_04() {
    final int input = 1443;
    final int expected = 37;
    final int actual = Solution.findSquareRoot(input);
    Assertions.assertEquals(expected, actual);
  }
}
