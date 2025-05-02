package com.github.yourarj.leetcode_top_interview_150.prob_098_validate_binary_search_tree;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void isValidBST_01() {
    final TreeNode tree = new TreeNode(new Integer[] {2, 1, 3});
    final boolean expected = true;
    final boolean actual = target.isValidBST(tree);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void isValidBST_02() {
    final TreeNode tree = new TreeNode(new Integer[] {5, 1, 4, null, null, 3, 6});
    final boolean expected = false;
    final boolean actual = target.isValidBST(tree);
    Assertions.assertEquals(expected, actual);
  }
}
