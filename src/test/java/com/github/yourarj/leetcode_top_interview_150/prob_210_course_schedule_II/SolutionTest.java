package com.github.yourarj.leetcode_top_interview_150.prob_210_course_schedule_II;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
  private final com.github.yourarj.leetcode_top_interview_150.prob_210_course_schedule_II.Solution target = new com.github.yourarj.leetcode_top_interview_150.prob_210_course_schedule_II.Solution();

  @Test
  void findOrder_01() {
    final int numCourse = 2;
    final int[][] prerequisites = {{1, 0}};
    final int[] expected = {0, 1};
    final int[] actual = target.findOrder(numCourse, prerequisites);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void findOrderTest_02() {
    final int numCourse = 4;
    final int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
    final int[] expected = {0, 1, 2, 3};
    final int[] actual = target.findOrder(numCourse, prerequisites);
    System.out.printf("expected: %s: actual: %s", Arrays.toString(expected), Arrays.toString(actual));
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void findOrderTest_03() {
    final int numCourse = 1;
    final int[][] prerequisites = {};
    final int[] expected = {0};
    final int[] actual = target.findOrder(numCourse, prerequisites);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void findOrderTest_05() {
    final int numCourse = 4;
    final int[][] prerequisites = {{1, 0}, {2, 0}};
    final int[] expected = {0, 1, 2, 3};
    final int[] actual = target.findOrder(numCourse, prerequisites);
    System.out.printf("expected: %s: actual: %s", Arrays.toString(expected), Arrays.toString(actual));
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void findOrderTest_06() {
    final int numCourse = 4;
    final int[][] prerequisites = {{0, 1}, {0, 2}};
    final int[] expected = {1, 2, 0, 3};
    final int[] actual = target.findOrder(numCourse, prerequisites);
    System.out.printf("expected: %s: actual: %s", Arrays.toString(expected), Arrays.toString(actual));
    Assertions.assertArrayEquals(expected, actual);
  }

}
