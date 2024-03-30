package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MazePathsTest {

  @Test
  void getAllPossiblePaths() {
    int targetX = 0;
    int targetY = 0;
    List<String> actual = MazePaths.getAllPossiblePaths(targetX,targetY);
    List<String> expected = List.of("LLDD", "LDLD", "LDDL", "DLLD", "DLDL", "DDLL");
    Assertions.assertIterableEquals(expected, actual);
    ;
  }
}
