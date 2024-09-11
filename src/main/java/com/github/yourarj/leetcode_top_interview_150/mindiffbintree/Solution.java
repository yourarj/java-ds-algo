package com.github.yourarj.leetcode_top_interview_150.mindiffbintree;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;

class Solution {
  Integer last = null;
  int min = Integer.MAX_VALUE;

  public int getMinimumDifference(TreeNode root) {
    if (root == null) {
      return min;
    }
    getMinimumDifference(root.left);

    if (last != null) {
      min = Math.min(min, root.val - last);
    }
    last = root.val;
    getMinimumDifference(root.right);

    return min;
  }
}
