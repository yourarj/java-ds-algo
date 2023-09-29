package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianglePatternTest {
  private final TrianglePattern target = new TrianglePattern();

  @Test
  void printTriangleZeroRows() {
    target.printTriangle(0);
  }

  @Test
  void printTriangleOnlyOneRow() {
    target.printTriangle(1);
  }

  @Test
  void printTriangleTwoRows() {
    target.printTriangle(2);
  }

  @Test
  void printTriangleThreeRows() {
    target.printTriangle(3);
  }

  @Test
  void printTriangleTenRows() {
    target.printTriangle(4);
  }
}
