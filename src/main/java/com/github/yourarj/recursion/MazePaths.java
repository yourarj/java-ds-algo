package com.github.yourarj.recursion;

import java.util.ArrayList;
import java.util.List;

public class MazePaths {

  public static List<String> getAllPossiblePaths(int targetX, int targetY) {
    return recursivePossiblePath("", targetX, targetY);
  }

  private static List<String> recursivePossiblePath(String path, int targetX, int targetY) {
    List<String> result = new ArrayList<>();

    if (targetX == 2 && targetY == 2) {
      result.add(path);
      return result;
    }
    // you are allowed to move either RIGHT or DOWN
    if (targetX < 2) result.addAll(recursivePossiblePath(path + 'L', targetX + 1, targetY));
    if (targetY < 2) result.addAll(recursivePossiblePath(path + 'D', targetX, targetY + 1));

    return result;
  }
}
