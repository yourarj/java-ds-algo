package com.github.yourarj.leetcode_top_interview_150.prob_130_surrounded_regions;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public void solve(char[][] board) {
    // iterate over first and last column
    for (int i = 0; i < board.length; i++) {
      if (board[i][0] == 'O') dfs(board, i, 0);
      if (board[i][board[0].length - 1] == 'O') dfs(board, i, board[0].length - 1);
    }

    // iterate over first and last row
    for (int i = 0; i < board[0].length; i++) {
      if (board[0][i] == 'O') dfs(board, 0, i);
      if (board[board.length - 1][i] == 'O') dfs(board, board.length - 1, i);
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'O') board[i][j] = 'X';
        else if (board[i][j] == '#') board[i][j] = 'O';
      }
    }
  }

  private void dfs(char[][] board, int x, int y) {
    final int rows = board.length;
    final int cols = board[0].length;

    //
    final Queue<Integer> q = new LinkedList<>();
    q.add(x * cols + y);
    board[x][y] = '#';

    while (!q.isEmpty()) {
      final int number = q.poll();

      int i = number / cols;
      int j = number % cols;

      if (i - 1 >= 0 && board[i - 1][j] == 'O') {
        q.add((i - 1) * cols + j);
        board[i - 1][j] = '#';
      }
      if (i + 1 < rows && board[i + 1][j] == 'O') {
        q.add((i + 1) * cols + j);
        board[i + 1][j] = '#';
      }
      if (j - 1 >= 0 && board[i][j - 1] == 'O') {
        q.add(i * cols + j - 1);
        board[i][j - 1] = '#';
      }
      if (j + 1 < cols && board[i][j + 1] == 'O') {
        q.add(i * cols + j + 1);
        board[i][j + 1] = '#';
      }
    }
  }
}
