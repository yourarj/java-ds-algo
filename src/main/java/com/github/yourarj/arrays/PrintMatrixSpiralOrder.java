package com.github.yourarj.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixSpiralOrder {

  enum Direction {
    RIGHT,
    LEFT,
    TOP,
    DOWN
  }

  public List<Integer> spiralOrder(int[][] matrix) {

    int rows = matrix.length;
    int columns = matrix[0].length;

    int totalElements = rows * columns;

    // initial direction
    Direction direction = Direction.RIGHT;

    // boundaries
    int right = columns;
    int bottom = rows;
    int left = 0;
    int top = 0;

    ArrayList<Integer> list = new ArrayList<>();
    int i = 0, j = 0;
    while (totalElements > 0) {
      list.add(matrix[i][j]);
      totalElements--;

      switch (direction) {
        case RIGHT:
          if (j < right - 1) {
            j++;
          } else {
            direction = Direction.DOWN;
            top++;
            i++;
          }
          break;
        case DOWN:
          if (i < bottom - 1) {
            i++;
          } else {
            direction = Direction.LEFT;
            right--;
            j--;
          }
          break;
        case LEFT:
          if (j > left) {
            j--;
          } else {
            direction = Direction.TOP;
            bottom--;
            i--;
          }
          break;
        case TOP:
          if (i > top) {
            i--;
          } else {
            direction = Direction.RIGHT;
            left++;
            j++;
          }
      }
    }
    return list;
  }
}
