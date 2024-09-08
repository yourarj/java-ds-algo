package com.github.yourarj.leetcode_top_interview_150.stringsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void strStr1() {
    String haystack = "sadbutsad";
    String needle = "sad";
    int expected = 0;
    int actual = target.strStr(haystack, needle);
    assertEquals(expected, actual);
  }

  @Test
  void strStr2() {
    String haystack = "leetcode";
    String needle = "leeto";
    int expected = -1;
    int actual = target.strStr(haystack, needle);
    assertEquals(expected, actual);
  }

  @Test
  void strStr3() {
    String haystack = "a";
    String needle = "a";
    int expected = 0;
    int actual = target.strStr(haystack, needle);
    assertEquals(expected, actual);
  }

  @Test
  void strStr4() {
    String haystack = "aarun";
    String needle = "arun";
    int expected = 1;
    int actual = target.strStr(haystack, needle);
    assertEquals(expected, actual);
  }

  @Test
  void strStr5() {
    String haystack = "mississippi";
    String needle = "issip";
    int expected = 4;
    int actual = target.strStr(haystack, needle);
    assertEquals(expected, actual);
  }
}
