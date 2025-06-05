package com.github.yourarj.gfg_amzn_sde_dsa.array.maximum_subarray_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void maxSubarraySUm_Test01() {
    final int[] arr = {2, 3, -8, 7, -1, 2, 3};
    final int expected = 11;
    final int actual = Solution.maxSubarraySUm(arr);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void maxSubarraySUm_Test02() {
    final int[] arr = {-2, -4};
    final int expected = -2;
    final int actual = Solution.maxSubarraySUm(arr);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void maxSubarraySUm_Test03() {
    final int[] arr = {5, 4, 1, 7, 8};
    final int expected = 25;
    final int actual = Solution.maxSubarraySUm(arr);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void maxSubarraySUm_Test04() {
    final int[] arr = {2, 3, -8, 7, -10, 2, 3};
    final int expected = 7;
    final int actual = Solution.maxSubarraySUm(arr);
    Assertions.assertEquals(expected, actual);
  }
}
