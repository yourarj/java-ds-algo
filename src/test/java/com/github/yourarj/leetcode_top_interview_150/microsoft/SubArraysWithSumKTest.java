package com.github.yourarj.leetcode_top_interview_150.microsoft;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArraysWithSumKTest {

  @Test
  void findSubArraysWithSumK() {
    final int[] input = {1, 3, -1, -5, 2, 3, -2, 5, -3};
    final int k = 3;
    final List<int[]> expected = new ArrayList<>();
    expected.add(new int[] {1, 1});
    expected.add(new int[] {0, 2});
    expected.add(new int[] {0, 5});
    expected.add(new int[] {5, 5});
    expected.add(new int[] {4, 6});
    expected.add(new int[] {3, 7});
    expected.add(new int[] {6, 7});
    expected.add(new int[] {0, 8});
    expected.add(new int[] {5, 8});

    List<int[]> subArrays = SubArraysWithSumK.findSubArraysWithSumK(input, k);

    for (int i = 0; i < subArrays.size(); i++) {
      Assertions.assertEquals(expected.get(i)[0], subArrays.get(i)[0]);
      Assertions.assertEquals(expected.get(i)[1], subArrays.get(i)[1]);
    }
  }
}
