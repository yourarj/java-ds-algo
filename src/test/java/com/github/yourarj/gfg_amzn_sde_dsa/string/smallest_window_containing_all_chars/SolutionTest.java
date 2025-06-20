package com.github.yourarj.gfg_amzn_sde_dsa.string.smallest_window_containing_all_chars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void smallestWindow_Test_01() {
    final String s = "timetopractice", p = "toc";
    final String expected = "toprac";
    final String actual = Solution.smallestWindow(s, p);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void smallestWindow_Test_02() {
    final String s = "zoomlazapzo", p = "oza";
    final String expected = "apzo";
    final String actual = Solution.smallestWindow(s, p);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void smallestWindow_Test_03() {
    final String s = "zoomaazbaaacapzoabc", p = "abc";
    final String expected = "abc";
    final String actual = Solution.smallestWindow(s, p);
    Assertions.assertEquals(expected, actual);
  }
}
