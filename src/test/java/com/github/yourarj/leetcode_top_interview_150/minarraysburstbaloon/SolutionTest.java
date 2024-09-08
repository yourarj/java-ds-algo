package com.github.yourarj.leetcode_top_interview_150.minarraysburstbaloon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void findMinArrowShots01() {
    final int[][] input = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
    final int expected = 2;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots02() {
    final int[][] input = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
    final int expected = 4;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots03() {
    final int[][] input = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
    final int expected = 2;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots04() {
    final int[][] input = {{-2147483648, 2147483647}};
    final int expected = 1;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots05() {
    final int[][] input = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
    final int expected = 2;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots06() {
    final int[][] input = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
    final int expected = 3;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots07() {
    final int[][] input = {{0, 10}, {20, 30}, {40, 50}, {60, 70}};
    final int expected = 4;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots08() {
    final int[][] input = {{-10, -5}, {-7, 0}, {2, 5}, {7, 10}};
    final int expected = 3;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots09() {
    final int[][] input = {{100, 200}, {150, 250}, {180, 220}, {210, 230}};
    final int expected = 2;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots10() {
    final int[][] input = {{-50, -40}, {-30, -20}, {-10, 0}, {10, 20}, {30, 40}};
    final int expected = 5;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots11() {
    final int[][] input = {{500, 510}, {520, 530}, {540, 550}, {560, 570}, {580, 590}};
    final int expected = 5;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots12() {
    final int[][] input = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}};
    final int expected = 3;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots13() {
    final int[][] input = {{10, 20}, {30, 40}, {50, 60}, {70, 80}, {90, 100}};
    final int expected = 5;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots14() {
    final int[][] input = {{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};
    final int expected = 2;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void findMinArrowShots15() {
    final int[][] input = {
      {3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}
    };
    final int expected = 2;
    final int actual = target.findMinArrowShots(input);
    Assertions.assertEquals(expected, actual);
  }
}
