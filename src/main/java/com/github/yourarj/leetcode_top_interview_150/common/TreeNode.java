package com.github.yourarj.leetcode_top_interview_150.common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {}

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public TreeNode(Integer[] arrRep) {
    TreeNode current = this;
    this.val = arrRep[0];

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(this);

    for (int i = 1; !queue.isEmpty() && i < arrRep.length; i++) {
      TreeNode node = queue.poll();
      if (arrRep[i] != null) {
        node.left = new TreeNode(arrRep[i]);
        queue.offer(node.left);
      }
      i++;
      if (i < arrRep.length && arrRep[i] != null) {
        node.right = new TreeNode(arrRep[i]);
        queue.offer(node.right);
      }
    }
  }

  private static void inOrder(TreeNode node) {
    if (node == null) return;
    inOrder(node.left);
    System.out.printf("%d, ", node.val);
    inOrder(node.right);
  }

  @Override
  public String toString() {
    return Integer.toString(val);
  }

  public void inOrder() {
    inOrder(this);
    System.out.println();
  }
}
