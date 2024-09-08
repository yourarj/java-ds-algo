package com.github.yourarj.leetcode_top_interview_150.rotatearray;

class Solution {
  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      for (int val : row) {
        System.out.printf("%02d ", val);
      }
      System.out.println();
    }
  }

  public void rotate(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len; i++)
      for (int j = i + 1; j < len; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }

    for (int k = 0; k < len; k++)
      for (int j = 0; j < len / 2; j++) {
        int temp = matrix[k][len - 1 - j];
        matrix[k][len - 1 - j] = matrix[k][j];
        matrix[k][j] = temp;
      }
  }

  public void rotateAntiClockwise(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len; i++)
      for (int j = i + 1; j < len; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }

    for (int k = 0; k < len; k++)
      for (int j = 0; j < len / 2; j++) {
        int temp = matrix[len - 1 - j][k];
        matrix[len - 1 - j][k] = matrix[j][k];
        matrix[j][k] = temp;
      }
  }
}
