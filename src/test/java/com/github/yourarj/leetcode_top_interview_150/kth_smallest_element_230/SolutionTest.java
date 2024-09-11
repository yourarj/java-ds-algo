package com.github.yourarj.leetcode_top_interview_150.kth_smallest_element_230;

import static org.junit.jupiter.api.Assertions.*;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void kthSmallest01() {
    final TreeNode tree = new TreeNode(new Integer[] {3, 1, 4, null, 2});
    final int k = 1;
    final int expected = 1;
    final int actual = target.kthSmallest(tree, k);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void kthSmallest02() {
    final TreeNode tree = new TreeNode(new Integer[] {5, 3, 6, 2, 4, null, null, 1});
    final int k = 3;
    final int expected = 3;
    final int actual = target.kthSmallest(tree, k);
    Assertions.assertEquals(expected, actual);
  }
}
