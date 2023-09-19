package com.github.yourarj.sorting;


import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProblemFindAllDuplicatesInArrayTest {
  private final ProblemFindAllDuplicatesInArray target = new ProblemFindAllDuplicatesInArray();

  @Test
  void findDuplicatesCase01() {
    int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> expected = List.of(2, 3);
    List<Integer> duplicates = target.findDuplicates(input);
    Assertions.assertIterableEquals(expected, duplicates);
  }

  @Test
  void findDuplicatesCase02() {
    int[] input = {1, 1, 2};
    List<Integer> expected = List.of(1);
    List<Integer> duplicates = target.findDuplicates(input);
    Assertions.assertIterableEquals(expected, duplicates);
  }

  @Test
  void findDuplicatesCase03() {
    int[] input = {1};
    List<Integer> expected = List.of();
    List<Integer> duplicates = target.findDuplicates(input);
    Assertions.assertIterableEquals(expected, duplicates);
  }
}
