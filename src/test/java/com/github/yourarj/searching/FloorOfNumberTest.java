package com.github.yourarj.searching;


import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FloorOfNumberTest {

  @Test
  void findCeilingOfNumber() {
    FloorOfNumber floorOfNumber = new FloorOfNumber();
    int needle = 15;
    int[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = floorOfNumber.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(9), output);
  }

  @Test
  void findFloorOfNumberLargerThanLastNumber() {
    FloorOfNumber floorOfNumber = new FloorOfNumber();
    int needle = 22;
    int[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = floorOfNumber.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.of(21), output);
  }

  @Test
  void findFloorOfNumberSmallerThanFirstNumber() {
    FloorOfNumber floorOfNumber = new FloorOfNumber();
    int needle = -30;
    int[] hayStack = {1, 3, 5, 7, 9, 18, 19, 20, 21};
    Optional<Integer> output = floorOfNumber.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }

  @Test
  void findFloorOfNumberSmallerInEmptyArray() {
    FloorOfNumber floorOfNumber = new FloorOfNumber();
    int needle = 1;
    int[] hayStack = {};
    Optional<Integer> output = floorOfNumber.floorOfNumber(needle, hayStack);

    Assertions.assertEquals(Optional.empty(), output);
  }
}
