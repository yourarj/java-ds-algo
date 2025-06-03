package com.github.yourarj.gfg_amzn_sde_dsa.string_formation_from_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isRepeat_Test_01() {
    final String input = "ABCABC";
    final boolean expected = true;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_02() {
    final String input = "ABABAB";
    final boolean expected = true;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_03() {
    final String input = "ABCDABCD";
    final boolean expected = true;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_04() {
    final String input = "GEEKSFORGEEKS";
    final boolean expected = false;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_05() {
    final String input = "GEEKGEEK";
    final boolean expected = true;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_06() {
    final String input = "AAAACAAAAC";
    final boolean expected = true;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_07() {
    final String input = "ABCDABC";
    final boolean expected = false;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_08() {
    final String input = "aabaabaaa";
    final boolean expected = false;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isRepeat_Test_09() {
    final String input = "aabaabaaapqrstaabaauvwxyz";
    final boolean expected = false;
    final boolean actual = Solution.isRepeat(input);
    Assertions.assertEquals(expected, actual);
  }
}
