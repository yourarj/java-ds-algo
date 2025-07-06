package com.github.yourarj.leetcode_top_interview_150.prob_238_product_of_array_excel_self;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void productExceptSelfTest_01() {
    final int[] input = {1, 2, 3, 4};
    final int[] expected = {24, 12, 8, 6};
    final int[] actual = Solution.productExceptSelf(input);
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  void productExceptSelfTest_02() {
    final int[] input = {-1, 1, 0, -3, 3};
    final int[] expected = {0, 0, 9, 0, 0};
    final int[] actual = Solution.productExceptSelf(input);
    Assertions.assertArrayEquals(expected, actual);
  }
}
