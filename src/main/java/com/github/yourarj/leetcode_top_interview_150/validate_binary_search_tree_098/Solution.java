package com.github.yourarj.leetcode_top_interview_150.validate_binary_search_tree_098;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;

class Solution {
  private long last = (long) Integer.MIN_VALUE - 1;

  public boolean isValidBST(TreeNode root) {
    if (root == null) return true;

    boolean left = isValidBST(root.left);
    if (last >= root.val) return false;
    last = root.val;
    boolean right = isValidBST(root.right);
    return left && right;
  }
}
