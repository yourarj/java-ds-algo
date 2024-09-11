package com.github.yourarj.leetcode_top_interview_150.bintreefrominandpreorder;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void buildTreeTest01() {
    final int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
    TreeNode node = target.buildTree(preorder, inorder);
    node.inOrder();
  }

  @Test
  void buildTreeTest02() {
    final int[] preorder = {2, 1}, inorder = {1, 2};
    TreeNode node = target.buildTree(preorder, inorder);
    node.inOrder();
  }

  @Test
  void buildTreeTest03() {
    final int[] preorder = {1, 2}, inorder = {1, 2};
    TreeNode node = target.buildTree(preorder, inorder);
    node.inOrder();
  }
}
