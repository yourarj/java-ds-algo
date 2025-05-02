package com.github.yourarj.leetcode_top_interview_150.prob_399_evaluate_division;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void calcEquation01() {
    final List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
    final double[] values = {2.0, 3.0};
    final List<List<String>> queries =
        List.of(
            List.of("a", "c"),
            List.of("b", "a"),
            List.of("a", "e"),
            List.of("a", "a"),
            List.of("x", "x"));
    final double[] expected = {6.00000, 0.50000, -1.00000, 1.00000, -1.00000};

    final double[] actual = target.calcEquation(equations, values, queries);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void calcEquation02() {
    final List<List<String>> equations =
        List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
    final double[] values = {1.5, 2.5, 5.0};
    final List<List<String>> queries =
        List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"));
    final double[] expected = {3.75000, 0.40000, 5.00000, 0.20000};

    final double[] actual = target.calcEquation(equations, values, queries);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void calcEquation03() {
    final List<List<String>> equations = List.of(List.of("a", "b"));
    final double[] values = {0.5};
    final List<List<String>> queries =
        List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"));
    final double[] expected = {0.50000, 2.00000, -1.00000, -1.00000};

    final double[] actual = target.calcEquation(equations, values, queries);
    Assertions.assertArrayEquals(expected, actual);
  }
}
