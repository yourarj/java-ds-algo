package com.github.yourarj.leetcode_top_interview_150.nextrightpointer2;

public class Solution {

  // based on level order traversal
  public void connect(TreeLinkNode root) {

    TreeLinkNode startOfNextRow = null, current = root, last = null;

    while (current != null) {

      while (current != null) {

        // handle left child
        if (current.left != null) {
          if (last == null) {
            startOfNextRow = current.left;
          } else {
            last.next = current.left;
          }
          last = current.left;
        }

        // handle right child
        if (current.right != null) {
          if (last == null) {
            startOfNextRow = current.right;
          } else {
            last.next = current.right;
          }
          last = current.right;
        }
        current = current.next;
      }

      current = startOfNextRow;
      startOfNextRow = null;
      last = null;
    }
  }

  public static class TreeLinkNode {
    public int val;
    public TreeLinkNode left;
    public TreeLinkNode right;
    public TreeLinkNode next;

    public TreeLinkNode() {}

    public TreeLinkNode(int _val) {
      val = _val;
    }

    public TreeLinkNode(int _val, TreeLinkNode _left, TreeLinkNode _right, TreeLinkNode _next) {
      val = _val;
      left = _left;
      right = _right;
      next = _next;
    }

    @Override
    public String toString() {
      return "TreeLinkNode{" + "val=" + val + '}';
    }
  }
}
