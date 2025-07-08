package com.github.yourarj.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidSudokuTest {

  @Test
  void isValidSudokuTest_01() {
    final char[][] board =
      {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

    final boolean expected = false;
    final boolean actual = ValidSudoku.isValidSudoku(board);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isValidSudokuTest_02() {
    final char[][] board = {
      {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

    final boolean expected = true;
    final boolean actual = ValidSudoku.isValidSudoku(board);

    Assertions.assertEquals(expected, actual);
  }
}
