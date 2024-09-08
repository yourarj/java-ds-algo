package com.github.yourarj.leetcode_top_interview_150.patternfollow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void wordPattern01() {
    String input = "abba";
    String s = "dog cat cat dog";
    boolean expected = true;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }

  @Test
  void wordPattern02() {
    String input = "abba";
    String s = "dog cat cat fish";
    boolean expected = false;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }

  @Test
  void wordPattern03() {
    String input = "aaaa";
    String s = "dog cat cat dog";
    boolean expected = false;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }

  @Test
  void wordPattern04() {
    String input = "abba";
    String s = "dog cat cat dog mat";
    boolean expected = false;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }

  @Test
  void wordPattern05() {
    String input = "a";
    String s = "d";
    boolean expected = true;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }

  @Test
  void wordPattern06() {
    String input = "a";
    String s = "dddd";
    boolean expected = true;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }

  @Test
  void wordPattern07() {
    String input = "a";
    String s = "dddd dddd";
    boolean expected = false;
    boolean actual = target.wordPattern(input, s);
    assertEquals(expected, actual);
  }
}
