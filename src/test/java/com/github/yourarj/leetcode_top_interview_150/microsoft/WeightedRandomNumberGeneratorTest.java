package com.github.yourarj.leetcode_top_interview_150.microsoft;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class WeightedRandomNumberGeneratorTest {

  @Test
  void getWeightedRandom() {
    final int[] source = {50, 50};
    final int iterations = 16;
    final List<Integer> expected = List.of(8, 8);
    final WeightedRandomNumberGenerator target = new WeightedRandomNumberGenerator(source);

    List<Integer> actual = new ArrayList<>(List.of(0, 0));
    for (int i = 0; i < iterations; i++) {
      int index = target.getWeightedRandom();
      actual.set(index, actual.get(index) + 1);
    }
  }

  @Test
  void getWeightedRandom1000Iterations() {
    final int[] source = {25, 75};
    final int iterations = 1000;
    final List<Integer> expected = List.of(250, 750);
    final WeightedRandomNumberGenerator target = new WeightedRandomNumberGenerator(source);

    List<Integer> actual = new ArrayList<>(List.of(0, 0));
    for (int i = 0; i < iterations; i++) {
      int index = target.getWeightedRandom();
      actual.set(index, actual.get(index) + 1);
    }
  }
}
