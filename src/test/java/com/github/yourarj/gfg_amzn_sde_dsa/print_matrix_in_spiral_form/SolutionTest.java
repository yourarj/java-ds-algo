package com.github.yourarj.gfg_amzn_sde_dsa.print_matrix_in_spiral_form;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

  @Test
  void spirallyTraverse_Test_01() {
    final int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    final List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
    final List<Integer> actual = Solution.spirallyTraverse(input);

    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void spirallyTraverse_Test_02() {
    final int[][] input = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};

    final List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11);
    final List<Integer> actual = Solution.spirallyTraverse(input);

    Assertions.assertIterableEquals(expected, actual);
  }
}
