package com.github.yourarj.arrays;

import static org.junit.jupiter.api.Assertions.*;

import com.github.yourarj.utils.Utils;
import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {
  private final SetMatrixZeroes target = new SetMatrixZeroes();

  @Test
  void setZeroesUseCase01() {
    int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    System.out.println(Utils.TwoDArrayToString(input));
    target.setZeroes(input);
    System.out.println(Utils.TwoDArrayToString(input));
  }

  @Test
  void setZeroesUseCase02() {
    int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    System.out.println(Utils.TwoDArrayToString(input));
    target.setZeroes(input);
    System.out.println(Utils.TwoDArrayToString(input));
  }

  @Test
  void setZeroesUseCase03() {
    int[][] input = {{0, 1}};
    System.out.println(Utils.TwoDArrayToString(input));
    target.setZeroes(input);
    System.out.println(Utils.TwoDArrayToString(input));
  }
}
