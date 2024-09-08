package com.github.yourarj.leetcode_top_interview_150.valid_parentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void isValid01() {
    String input = "{]";
    boolean expected = false;
    boolean actual = target.isValid(input);
    assertEquals(expected, actual);
  }

  @Test
  void isValid02() {
    String input = "([])";
    boolean expected = true;
    boolean actual = target.isValid(input);
    assertEquals(expected, actual);
  }

  @Test
  void isValid03() {
    String input = "}";
    boolean expected = false;
    boolean actual = target.isValid(input);
    assertEquals(expected, actual);
  }

  @Test
  void isValid04() {
    String input = "(){}[]";
    boolean expected = true;
    boolean actual = target.isValid(input);
    assertEquals(expected, actual);
  }

  @Test
  void isValid05() {
    String input = "({}[]";
    boolean expected = false;
    boolean actual = target.isValid(input);
    assertEquals(expected, actual);
  }
}
