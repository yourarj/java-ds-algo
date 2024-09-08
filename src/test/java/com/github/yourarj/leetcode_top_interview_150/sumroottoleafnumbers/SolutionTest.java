package com.github.yourarj.leetcode_top_interview_150.sumroottoleafnumbers;

import com.github.yourarj.leetcode_top_interview_150.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void test01() {
    final Integer[] arr = {4, 9, 0, 5, 1};
    final ListNode.TreeNode root = new ListNode.TreeNode(arr);

    target.sumNumbers(root);
  }

  @Test
  void test02() {
    final Integer[] arr = {1, null, 2, 3};
    final ListNode.TreeNode root = new ListNode.TreeNode(arr);

    target.sumNumbers(root);
  }
}
