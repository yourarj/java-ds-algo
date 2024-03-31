package com.github.yourarj.backtracking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NQueenTest {
  private final NQueen target = new NQueen();

  @Test
  void nQueenCheckWithN4() {
    final int n = 4;
    final List<List<String>> expected =
        List.of(List.of(".Q..", "...Q", "Q...", "..Q."), List.of("..Q.", "Q...", "...Q", ".Q.."));
    final List<List<String>> actual = target.solveNQueens(n);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void nQueenCheckWithN1() {
    final int n = 1;
    final List<List<String>> expected = List.of(List.of("Q"));
    final List<List<String>> actual = target.solveNQueens(n);
    Assertions.assertIterableEquals(expected, actual);
  }
}
