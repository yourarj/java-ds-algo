package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindInRotatedArrayTest {
  private final FindInRotatedArray target = new FindInRotatedArray();

  @Test
  void findCase01() {
    final int[] input = {5, 6, 7, -10, -9, -8, 0, 1, 2, 3, 4};
    assertEquals(0, target.find(input, 5, 0, input.length - 1));
    assertEquals(1, target.find(input, 6, 0, input.length - 1));
    assertEquals(2, target.find(input, 7, 0, input.length - 1));
    assertEquals(3, target.find(input, -10, 0, input.length - 1));
    assertEquals(4, target.find(input, -9, 0, input.length - 1));
    assertEquals(5, target.find(input, -8, 0, input.length - 1));
    assertEquals(6, target.find(input, 0, 0, input.length - 1));
    assertEquals(7, target.find(input, 1, 0, input.length - 1));
    assertEquals(8, target.find(input, 2, 0, input.length - 1));
    assertEquals(9, target.find(input, 3, 0, input.length - 1));
    assertEquals(10, target.find(input, 4, 0, input.length - 1));
  }

  @Test
  void case02FindNonExistentNeedle() {
    final int[] input = {5, 6, 7, -10, -9, -8, 0, 1, 2, 3, 4};
    assertEquals(-1, target.find(input, 55, 0, input.length - 1));
  }

  @Test
  void findCase03() {
    final int[] input = {};
    assertEquals(-1, target.find(input, 55, 0, input.length - 1));
  }

  @Test
  void findCase04() {
    final int[] input = {55};
    assertEquals(0, target.find(input, 55, 0, input.length - 1));
  }

  @Test
  void findCase05() {
    final int[] input = {55, 56};
    assertEquals(0, target.find(input, 55, 0, input.length - 1));
  }

  @Test
  void findCase06() {
    final int[] input = {55, 56};
    assertEquals(-1, target.find(input, 555, 0, input.length - 1));
  }
}
