package com.github.yourarj.searching;


import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FloorOfNumberTest {
  private final FloorOfNumber target = new FloorOfNumber();

  @Test
  void findCeilingOfNumber() {
    int needle = 15;
    int[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = target.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(9), output);
  }

  @Test
  void findFloorOfNumberLargerThanLastNumber() {
    int needle = 22;
    int[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = target.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(21), output);
  }

  @Test
  void findFloorOfNumberSmallerThanFirstNumber() {
    int needle = -30;
    int[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = target.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }

  @Test
  void findFloorOfNumberSmallerInEmptyArray() {
    int needle = 1;
    int[] hayStack = {};
    Optional<Integer> output = target.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }
}
