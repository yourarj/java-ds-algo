package com.github.yourarj.leetcode_top_interview_150.prob_230_kth_smallest_element;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
  private int counter = 0;

  public int kthSmallest(TreeNode root, int k) {
    if (root == null) return -1;

    int left = kthSmallest(root.left, k);
    counter++;
    if (k == counter) return root.val;
    int right = kthSmallest(root.right, k);

    return Math.max(left, right);
  }
}
