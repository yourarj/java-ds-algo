package com.github.yourarj.leetcode_top_interview_150.validatesudoku;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      Set<Character> row = new HashSet<>(9);
      Set<Character> col = new HashSet<>(9);
      Set<Character> box = new HashSet<>(9);

      for (int j = 0; j < board.length; j++) {
        if (board[i][j] != '.' && !row.add(board[i][j])) return false;
        if (board[j][i] != '.' && !col.add(board[j][i])) return false;
        int boxRow = 3 * (i / 3) + j / 3;
        int boxCol = 3 * (i % 3) + j % 3;
        if (board[boxRow][boxCol] != '.' && !box.add(board[boxRow][boxCol])) return false;
      }
    }
    return true;
  }
}
