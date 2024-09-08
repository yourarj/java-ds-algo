package com.github.yourarj.leetcode_top_interview_150.symflip;

public class SymmetricFlip {
  public static void flipSymmetric(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      System.out.println();
      for (int j = i + 1; j < n; j++) {
        System.out.printf(
            "matrix[%d][%d]=%02d <=> matrix[%d][%d]=%02d\n",
            i, j, matrix[i][j], j, i, matrix[j][i]);
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
      printMatrix(matrix);
      System.out.println();
    }
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.printf("%02d ", val);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };

    System.out.println("Original Matrix:");
    printMatrix(matrix);

    flipSymmetric(matrix);

    System.out.println("Matrix after Symmetric Flip:");
    printMatrix(matrix);
  }
}
