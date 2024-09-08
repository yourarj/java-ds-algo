package com.github.yourarj.leetcode_top_interview_150.sortedarrtobt;

import com.github.yourarj.leetcode_top_interview_150.common.ListNode;

class Solution {
  public ListNode.TreeNode sortedArrayToBST(int[] nums) {
    return toTreeRec(nums, 0, nums.length - 1);
  }

  private ListNode.TreeNode toTreeRec(int[] nums, int left, int right) {
    if (left > right) return null;
    int mid = left + (right - left) / 2;
    ListNode.TreeNode current = new ListNode.TreeNode(nums[mid]);
    current.left = toTreeRec(nums, left, mid - 1);
    current.right = toTreeRec(nums, mid + 1, right);
    return current;
  }
}
