package com.github.yourarj.recursion;

public class TrianglePattern {
  public void printTriangle(int numRows) {
    printer(numRows, 0);
  }

  private void printer(int row, int column) {
    if (row < 1) return;

    if (column < row) {
      System.out.print("* ");
      column++;
    } else {
      System.out.println();
      column = 0;
      row--;
    }
    printer(row, column);
  }
}
