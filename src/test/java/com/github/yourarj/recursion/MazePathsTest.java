package com.github.yourarj.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MazePathsTest {

  @Test
  void getAllPossiblePaths() {
    List<String> actual = MazePaths.getAllPossiblePaths(0, 0);
    System.out.printf("The path is %s", actual);
  }
}
