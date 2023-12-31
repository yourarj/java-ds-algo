package com.github.yourarj.arrays;


public class GenerateSpiralMatrix {
  enum Direction {
    RIGHT,
    LEFT,
    TOP,
    DOWN
  }

  public int[][] generateMatrix(int n) {

      int totalElements = n * n;

    // initial direction
    Direction direction = Direction.RIGHT;

    // boundaries
    int right = n;
    int bottom = n;
    int left = 0;
    int top = 0;

    int i = 0, j = 0;
    int element = 1;
    int[][] matrix = new int[n][n];
    while (totalElements > 0) {
      matrix[i][j] = element;
      totalElements--;
      element++;

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
    return matrix;
  }
}
