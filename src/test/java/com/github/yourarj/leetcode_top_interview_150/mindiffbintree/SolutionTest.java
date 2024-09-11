package com.github.yourarj.leetcode_top_interview_150.mindiffbintree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
  final Solution target = new Solution();

  @Test
  void getMinimumDifference01() {
    final TreeNode input = new TreeNode(new Integer[] {236, 104, 701, null, 227, null, 911});
    //        input.inOrder();
    int expected = 9;
    int actual = target.getMinimumDifference(input);
    assertEquals(expected, actual);
  }

  @Test
  void getMinimumDifference02() {
    final TreeNode input = new TreeNode(new Integer[] {236, 104, 701, null, 227, null, 911, 105});
    //        input.inOrder();
    int expected = 1;
    int actual = target.getMinimumDifference(input);
    assertEquals(expected, actual);
  }
}
