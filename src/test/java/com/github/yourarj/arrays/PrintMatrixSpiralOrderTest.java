package com.github.yourarj.arrays;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrintMatrixSpiralOrderTest {
  private final PrintMatrixSpiralOrder target = new PrintMatrixSpiralOrder();

  @Test
  void spiralOrder() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);

    Assertions.assertEquals(expected, target.spiralOrder(matrix));
  }

  @Test
  void spiralOrderCase02() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);

    Assertions.assertEquals(expected, target.spiralOrder(matrix));
  }
}
