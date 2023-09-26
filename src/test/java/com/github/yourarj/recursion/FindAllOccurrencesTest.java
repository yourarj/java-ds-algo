package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindAllOccurrencesTest {
  FindAllOccurrences target = new FindAllOccurrences();

  @Test
  void findAllCase01() {
    int[] input = {};
    int needle = 1;
    List<Integer> expected = List.of();
    Assertions.assertIterableEquals(expected, target.findAll(input, needle, 0));
  }

  @Test
  void findAllCase02() {
    int[] input = {0, 100};
    int needle = 100;
    List<Integer> expected = List.of(1);
    Assertions.assertIterableEquals(expected, target.findAll(input, needle, 0));
  }

  @Test
  void findAllCase03() {
    int[] input = {0, 2, 4, 4, 5};
    int needle = 4;
    List<Integer> expected = List.of(3, 2);
    Assertions.assertIterableEquals(expected, target.findAll(input, needle, 0));
  }
}
