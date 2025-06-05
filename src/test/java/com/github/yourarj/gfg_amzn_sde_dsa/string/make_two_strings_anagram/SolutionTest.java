package com.github.yourarj.gfg_amzn_sde_dsa.string.make_two_strings_anagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void makeAnagram_Test_01() {
    final String s1 = "bcadeh", s2 = "hea";
    final int expected = 3;
    final int actual = Solution.makeAnagram(s1, s2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void makeAnagram_Test_02() {
    final String s1 = "cddgk", s2 = "gcda";
    final int expected = 3;
    final int actual = Solution.makeAnagram(s1, s2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void makeAnagram_Test_03() {
    final String s1 = "bca", s2 = "acb";
    final int expected = 0;
    final int actual = Solution.makeAnagram(s1, s2);
    Assertions.assertEquals(expected, actual);
  }
}



