package com.github.yourarj.recursion;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
  public static List<String> getAllPaths(int targetX, int targetY) {
    boolean[][] matrix = {{true, true, true}, {true, true, true}, {true, true, true}};
    return worker("", targetX, targetY, matrix);
  }

  private static List<String> worker(String path, int targetX, int targetY, boolean[][] matrix) {
    List<String> result = new ArrayList<>();

    if (targetX == matrix.length - 1 && targetY == matrix[0].length - 1) {
      result.add(path);
      return result;
    }

    if (!matrix[targetX][targetY]) {
      return result;
    }

    matrix[targetX][targetY] = false;

    if (targetX < matrix.length - 1)
      result.addAll(worker(path + 'D', targetX + 1, targetY, matrix));

    if (targetY < matrix[0].length - 1)
      result.addAll(worker(path + 'R', targetX, targetY + 1, matrix));

    if (targetX > 0) result.addAll(worker(path + 'U', targetX - 1, targetY, matrix));

    if (targetY > 0) result.addAll(worker(path + 'L', targetX, targetY - 1, matrix));

    matrix[targetX][targetY] = true;

    return result;
  }
}
