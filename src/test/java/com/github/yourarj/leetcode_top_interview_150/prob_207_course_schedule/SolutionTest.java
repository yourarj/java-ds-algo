package com.github.yourarj.leetcode_top_interview_150.prob_207_course_schedule;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void canFinish_01() {
    final int numCourse = 2;
    final int[][] prerequisites = {{1, 0}};
    final boolean expected = true;
    final boolean actual = target.canFinish(numCourse, prerequisites);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void canFinish_02() {
    final int numCourse = 2;
    final int[][] prerequisites = {{1, 0}, {0, 1}};
    final boolean expected = false;
    final boolean actual = target.canFinish(numCourse, prerequisites);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void canFinish_03() {
    final int numCourse = 20;
    final int[][] prerequisites = {
      {0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}
    };
    final boolean expected = false;
    final boolean actual = target.canFinish(numCourse, prerequisites);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void canFinish_04() {
    final int numCourse = 8;
    final int[][] prerequisites = {{1, 0}, {2, 6}, {1, 7}, {6, 4}, {7, 0}, {0, 5}};
    final boolean expected = true;
    final boolean actual = target.canFinish(numCourse, prerequisites);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void canFinish_05() {
    final int numCourse = 8;
    final int[][] prerequisites = {{1, 0}, {2, 1}, {3, 4}, {4, 3}};
    final boolean expected = false;
    final boolean actual = target.canFinish(numCourse, prerequisites);
    Assertions.assertEquals(expected, actual);
  }
}
