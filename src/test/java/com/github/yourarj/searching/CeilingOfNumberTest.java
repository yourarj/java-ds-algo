package com.github.yourarj.searching;

import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CeilingOfNumberTest {
  private final CeilingOfNumber target = new CeilingOfNumber();

  @Test
  void findCeilingOfNumber() {
    int needle = 15;
    Integer[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = target.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(18), output);
  }

  @Test
  void findCeilingOfNumberLargerThanLastNumber() {
    int needle = 22;
    Integer[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = target.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }

  @Test
  void findCeilingOfNumberSmallerThanFirstNumber() {
    int needle = -30;
    Integer[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = target.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(1), output);
  }

  @Test
  void findFloorOfNumberSmallerInEmptyArray() {
    int needle = 1;
    Integer[] hayStack = {};
    Optional<Integer> output = target.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }
}
