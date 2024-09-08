package com.github.yourarj.leetcode_top_interview_150.binarytreezigzagordertraversal;

import com.github.yourarj.leetcode_top_interview_150.common.ListNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
  public List<List<Integer>> zigzagLevelOrder(ListNode.TreeNode root) {
    final List<List<Integer>> res = new ArrayList<>();

    if (null == root) return res;

    Deque<ListNode.TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> list = new ArrayList<>(size);
      for (int i = 0; i < size; i++) {
        // when going
        ListNode.TreeNode curr = queue.remove();
        list.add(curr.val);
        if (curr.left != null) queue.add(curr.left);
        if (curr.right != null) queue.add(curr.right);
      }
      res.add(list);
    }
    return res;
  }
}
