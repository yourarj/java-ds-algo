package com.github.yourarj.leetcode_top_interview_150.number_of_islands_200;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  private final int[] xDirection = {-1, 0, 0, 1};
  private final int[] yDirection = {0, -1, 1, 0};

  public int numIslands(char[][] grid) {
    final int height = grid.length;
    final int width = grid[0].length;

    int count = 0;
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {

        if (grid[i][j] == '1') {
          count++;
          dfs(grid, i, j, height, width);
        }
      }
    }
    return count;
  }

  private void dfs(char[][] grid, int i, int j, int height, int width) {
    Queue<Integer> queue = new LinkedList<>();

    // add first element
    queue.add(i * width + j);

    while (!queue.isEmpty()) {
      final int num = queue.remove();

      final int row = num / width;
      final int col = num % width;

      // skip if already processed
      if (grid[row][col] == '0') continue;

      // mark visited
      grid[row][col] = '0';

      for (int k = 0; k < xDirection.length; k++) {
        int newRow = row + xDirection[k];
        int newCol = col + yDirection[k];

        // check if generated indexes are valid, skip otherwise
        if (newRow < 0
            || newRow > height - 1
            || newCol < 0
            || newCol > width - 1
            || grid[newRow][newCol] == '0') continue;

        queue.add(newRow * width + newCol);
      }
    }
  }
}
