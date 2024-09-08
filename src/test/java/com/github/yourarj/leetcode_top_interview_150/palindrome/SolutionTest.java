package com.github.yourarj.leetcode_top_interview_150.palindrome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void case01() {
    String input = "A man, a plan, a canal: Panama";
    boolean expected = true;
    boolean actual = target.isPalindrome(input);
    assertEquals(expected, actual);
  }

  @Test
  void case02() {
    String input = "race a car";
    boolean expected = false;
    boolean actual = target.isPalindrome(input);
    assertEquals(expected, actual);
  }

  @Test
  void case03() {
    String input = " ";
    boolean expected = true;
    boolean actual = target.isPalindrome(input);
    assertEquals(expected, actual);
  }
}
