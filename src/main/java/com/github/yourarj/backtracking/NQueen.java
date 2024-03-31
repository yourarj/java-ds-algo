package com.github.yourarj.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {
  public List<List<String>> solveNQueens(int n) {
    boolean[][] board = new boolean[n][n];

    final int initialRow = 0;

    List<List<String>> output = new ArrayList<>(n);

    worker(board, initialRow, output, n);
    return output;
  }

  private void worker(boolean[][] board, int row, List<List<String>> output, int targets) {
    if (targets == 0) {
      output.add(generateList(board));
      return;
    }

    for (int col = 0; col < board.length; col++) {
      if (isSafePlaceForQueen(board, row, col)) {
        board[row][col] = true;
        worker(board, row + 1, output, targets - 1);
        board[row][col] = false;
      }
    }
  }

  private boolean isSafePlaceForQueen(boolean[][] board, int x, int y) {
    for (boolean[] booleans : board) {
      if (booleans[y]) {
        return false;
      }
    }

    // check left diagonal values
    for (int i = 1; i <= Math.min(x, y); i++) {
      if (board[x - i][y - i]) {
        return false;
      }
    }

    // check right diagonal values
    for (int i = 1; i <= Math.min(x, board.length - y - 1); i++) {
      if (board[x - i][y + i]) {
        return false;
      }
    }

    return true;
  }

  public List<String> generateList(boolean[][] board) {
    List<String> list = new ArrayList<>(board.length);
    for (boolean[] row : board) {
      char[] chars = new char[row.length];

      Arrays.fill(chars, '.');

      for (int i = 0; i < board.length; i++) {
        if (row[i]) {
          chars[i] = 'Q';
        }
      }
      list.add(new String(chars));
    }
    return list;
  }
}
