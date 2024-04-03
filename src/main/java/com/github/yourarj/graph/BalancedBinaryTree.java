package com.github.yourarj.graph;

public class BalancedBinaryTree {
  public boolean isBalanced(BinaryTreeNode root) {
    if (root == null) return true;
    return getHeight(root) != -1;
  }

  // Create a function to return the “height” of a current subtree using recursion...
  public int getHeight(BinaryTreeNode root) {
    // Base case...
    if (root == null) return 0;
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);

    // if any of the subtree is unbalanced
    if (leftHeight == -1 || rightHeight == -1) return -1;
    // if difference between heights is more than 1
    if (Math.abs(leftHeight - rightHeight) > 1) return -1;

    return Math.max(leftHeight, rightHeight) + 1;
  }
}
