package com.github.yourarj.leetcode_top_interview_150.bintreefrominandpostorder;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;

class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    final int size = inorder.length;
    return buildTreeRecursive(inorder, postorder, size, size - 1, 0, size - 1);
  }

  private TreeNode buildTreeRecursive(
      int[] inorder, int[] postorder, final int size, int postParent, int inLeft, int inRight) {
    if (inLeft > inRight || postParent < 0) return null;

    TreeNode node = new TreeNode(postorder[postParent]);
    int index = getIndex(inorder, postorder[postParent], inLeft, inRight);

    // e.g.  final int[] inorder = {9, 3, 15, 20, 7}, postorder = {9, 15, 7, 20, 3};
    node.left =
        buildTreeRecursive(
            inorder, postorder, size, postParent - (inRight - inLeft), inLeft, index - 1);
    node.right = buildTreeRecursive(inorder, postorder, size, postParent - 1, index + 1, inRight);
    return node;
  }

  private int getIndex(int[] arr, int element, int left, int right) {
    int index = -1;
    for (int i = left; i <= right; i++) {
      if (arr[i] == element) {
        index = i;
        break;
      }
    }
    return index;
  }
}
