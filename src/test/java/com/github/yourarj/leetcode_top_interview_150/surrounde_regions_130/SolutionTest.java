package com.github.yourarj.leetcode_top_interview_150.surrounde_regions_130;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void test01() {
    final char[][] input = {
      {'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}
    };
    final char[][] expected = {
      {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}
    };

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void test02() {
    final char[][] input = {
      {'X', 'X', 'O', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}
    };
    final char[][] expected = {
      {'X', 'X', 'O', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}
    };

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void test03() {
    final char[][] input = {
      {'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O'}
    };
    final char[][] expected = {
      {'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O'},
      {'O', 'O', 'O', 'O'}
    };

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void test04() {
    final char[][] input = {
      {'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'X', 'X'}
    };
    final char[][] expected = {
      {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}
    };

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void test05() {
    final char[][] input = {
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
      {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
      {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'}
    };
    final char[][] expected = {
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'},
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'}
    };

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void test06() {
    final char[][] input = {
      {'X', 'X', 'X', 'X', 'O', 'X', 'X'},
      {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
      {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'}
    };
    final char[][] expected = {
      {'X', 'X', 'X', 'X', 'O', 'X', 'X'},
      {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
      {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
      {'X', 'X', 'X', 'X', 'X', 'X', 'X'}
    };

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void testSingleX() {
    final char[][] input = {{'X'}};
    final char[][] expected = {{'X'}};

    target.solve(input);

    assertArrayEquals(expected, input);
  }

  @Test
  void testSingleO() {
    final char[][] input = {{'O'}};
    final char[][] expected = {{'O'}};

    target.solve(input);

    assertArrayEquals(expected, input);
  }
}
