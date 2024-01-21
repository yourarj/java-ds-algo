package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkipStringTest {
  private final SkipString target = new SkipString();

  @Test
  void skipACharacter() {
    final String input = "aabcbbrajbbd";
    final String expected = "aabcbbbbd";
    final String charToSkip = "raj";

    final String output = target.skipACharacter(input, charToSkip);
    assertEquals(expected, output);
  }

  @Test
  void shouldNotImpactEmptyString() {
    final String input = "";
    final String expected = "";
    final String charToSkip = "baj";

    final String output = target.skipACharacter(input, charToSkip);
    assertEquals(expected, output);
  }

  @Test
  void shouldNotStringWithoutSkipChar() {
    final String input = "aadvdsafashaha";
    final String expected = "aadvdsafashaha";
    final String charToSkip = "baja";

    final String output = target.skipACharacter(input, charToSkip);
    assertEquals(expected, output);
  }
}
