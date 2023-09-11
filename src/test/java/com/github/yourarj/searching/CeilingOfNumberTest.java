package com.github.yourarj.searching;

import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CeilingOfNumberTest {

  @Test
  void findCeilingOfNumber() {
    CeilingOfNumber ceilingOfNumber = new CeilingOfNumber();
    int needle = 15;
    Integer[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = ceilingOfNumber.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(18), output);
  }

  @Test
  void findCeilingOfNumberLargerThanLastNumber() {
    CeilingOfNumber ceilingOfNumber = new CeilingOfNumber();
    int needle = 22;
    Integer[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = ceilingOfNumber.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }

  @Test
  void findCeilingOfNumberSmallerThanFirstNumber() {
    CeilingOfNumber ceilingOfNumber = new CeilingOfNumber();
    int needle = -30;
    Integer[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = ceilingOfNumber.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(1), output);
  }

  @Test
  void findFloorOfNumberSmallerInEmptyArray() {
    CeilingOfNumber ceilingOfNumber = new CeilingOfNumber();
    int needle = 1;
    Integer[] hayStack = {};
    Optional<Integer> output = ceilingOfNumber.findCeilingOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }
}
