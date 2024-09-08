package com.github.yourarj.leetcode_top_interview_150.sumroottoleafnumbers;

import com.github.yourarj.leetcode_top_interview_150.common.ListNode;

class Solution {
  public int sumNumbers(ListNode.TreeNode root) {
    int ss = sum(root, 0);
    return ss;
  }

  public int sum(ListNode.TreeNode root, int s) {
    if (root == null) {
      return s;
    }

    s = (s * 10) + root.val;

    if (root.left == null && root.right == null) return s;

    int l = root.left == null ? 0 : sum(root.left, s);
    int r = root.right == null ? 0 : sum(root.right, s);

    return l + r;
  }
}
