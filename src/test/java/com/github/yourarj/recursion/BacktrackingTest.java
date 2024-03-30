package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class BacktrackingTest {

  @Test
  void getAllPaths() {
    int targetX = 0;
    int targetY = 0;
    List<String> actual = Backtracking.getAllPaths(targetX, targetY);
    List<String> expected =
        List.of(
            "DDRR",
            "DDRURD",
            "DDRUURDD",
            "DRDR",
            "DRRD",
            "DRURDD",
            "RDDR",
            "RDRD",
            "RDLDRR",
            "RRDD",
            "RRDLDR",
            "RRDLLDRR");
    assertIterableEquals(expected, actual);
  }
}
