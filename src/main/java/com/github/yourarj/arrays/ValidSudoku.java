package com.github.yourarj.arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
  public static boolean isValidSudoku(char[][] board) {
    final Set<Character> chars = new HashSet<>(9, 1.0F);
    for (int i = 0; i < board.length; i++) {
      // validate rows
      chars.clear();
      for (int j = 0; j < board.length; j++) {
        final char c = board[i][j];
        if (c != '.' && !chars.add(c)) {
          return false;
        }
      }

      // validate columns
      chars.clear();
      for (int j = 0; j < board.length; j++) {
        final char c = board[j][i];
        if (c != '.' && !chars.add(c)) {
          return false;
        }
      }

      // validate boxes
      chars.clear();
      for (int j = 0; j < board.length; j++) {
        final int x = 3 * (i / 3) + j / 3;
        final int y = 3 * (i % 3) + j % 3;
        final char c = board[x][y];
        if (c != '.' && !chars.add(c)) {
          return false;
        }
      }
    }

    return true;
  }
}
