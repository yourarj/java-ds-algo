package com.github.yourarj.graph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {
  private final BalancedBinaryTree target = new BalancedBinaryTree();

  @Test
  void isBalanced() {

    // [1,2,2,3,3,null,null,4,4]
    BinaryTreeNode root = new BinaryTreeNode(1);
    BinaryTreeNode level1left = new BinaryTreeNode(2);
    BinaryTreeNode level1Right = new BinaryTreeNode(2);
    root.left = level1left;
    root.right = level1Right;

    BinaryTreeNode level2left = new BinaryTreeNode(3);
    BinaryTreeNode level2Right = new BinaryTreeNode(3);
    level1left.left = level2left;
    level1left.right = level2Right;
    BinaryTreeNode level3left = new BinaryTreeNode(4);
    BinaryTreeNode level3Right = new BinaryTreeNode(4);
    level2left.left = level3left;
    level2left.right = level3Right;

    assertEquals(false, target.isBalanced(root));
  }
}
