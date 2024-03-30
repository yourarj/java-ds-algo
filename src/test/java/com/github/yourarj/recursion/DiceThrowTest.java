package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceThrowTest {
  @Test
  void diceUseCase01() {
    final int input = 4;
    final List<String> actual = DiceThrow.dice(input);
    final List<String> expected = List.of("1111", "112", "121", "13", "211", "22", "31", "4");
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void diceUseCase02() {
    final int input = 1;
    final List<String> actual = DiceThrow.dice(input);
    final List<String> expected = List.of("1");
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void diceUseCase03() {
    final int input = 2;
    final List<String> actual = DiceThrow.dice(input);
    final List<String> expected = List.of("11", "2");
    Assertions.assertIterableEquals(expected, actual);
  }
}
