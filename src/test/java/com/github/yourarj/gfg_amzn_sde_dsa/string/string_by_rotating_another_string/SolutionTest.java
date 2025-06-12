package com.github.yourarj.gfg_amzn_sde_dsa.string.string_by_rotating_another_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isRotated_Test_01() {
    final String str1 = "amazon", str2 = "azonam";
    final boolean expected = true;
    final boolean actual = Solution.isRotated(str1, str2);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRotated_Test_02() {
    final String str1 = "amazon", str2 = "onamaz";
    final boolean expected = true;
    final boolean actual = Solution.isRotated(str1, str2);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRotated_Test_03() {
    final String str1 = "amazon", str2 = "mazona";
    final boolean expected = false;
    final boolean actual = Solution.isRotated(str1, str2);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRotated_Test_04() {
    final String str1 = "amazon", str2 = "";
    final boolean expected = false;
    final boolean actual = Solution.isRotated(str1, str2);

    Assertions.assertEquals(expected, actual);
  }
}
