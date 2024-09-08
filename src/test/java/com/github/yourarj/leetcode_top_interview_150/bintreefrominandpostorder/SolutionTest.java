package com.github.yourarj.leetcode_top_interview_150.bintreefrominandpostorder;

import com.github.yourarj.leetcode_top_interview_150.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final com.github.yourarj.leetcode_top_interview_150.bintreefrominandpostorder.Solution
      target =
          new com.github.yourarj.leetcode_top_interview_150.bintreefrominandpostorder.Solution();

  @Test
  void buildTreeTest01() {
    final int[] inorder = {9, 3, 15, 20, 7}, postorder = {9, 15, 7, 20, 3};
    ListNode.TreeNode node = target.buildTree(inorder, postorder);
    node.inOrder();
  }

  @Test
  void buildTreeTest02() {
    final int[] inorder = {-1}, postorder = {-1};
    ListNode.TreeNode node = target.buildTree(inorder, postorder);
    node.inOrder();
  }

  @Test
  void buildTreeTest03() {
    final int[] inorder = {1, 2}, postorder = {2, 1};
    ListNode.TreeNode node = target.buildTree(inorder, postorder);
    node.inOrder();
  }

  @Test
  void buildTreeTest04() {
    final int[] inorder = {2, 1}, postorder = {2, 1};
    ListNode.TreeNode node = target.buildTree(inorder, postorder);
    node.inOrder();
  }

  @Test
  void buildTreeTest05() {
    final int[] inorder = {3, 2, 1}, postorder = {3, 2, 1};
    ListNode.TreeNode node = target.buildTree(inorder, postorder);
    node.inOrder();
  }
}
