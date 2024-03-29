package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkipCharacterTest {
  private final SkipCharacter target = new SkipCharacter();

  @Test
  void skipACharacter() {
    final String input = "aabcbbbbd";
    final String expected = "aacd";
    final char charToSkip = 'b';

    final String output = target.skipACharacter(input, charToSkip);
    assertEquals(expected, output);
  }

  @Test
  void shouldNotImpactEmptyString() {
    final String input = "";
    final String expected = "";
    final char charToSkip = 'b';

    final String output = target.skipACharacter(input, charToSkip);
    assertEquals(expected, output);
  }

  @Test
  void shouldNotStringWithoutSkipChar() {
    final String input = "aadvdsafashaha";
    final String expected = "aadvdsafashaha";
    final char charToSkip = 'b';

    final String output = target.skipACharacter(input, charToSkip);
    assertEquals(expected, output);
  }
}
