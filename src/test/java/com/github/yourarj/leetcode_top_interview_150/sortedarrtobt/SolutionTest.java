package com.github.yourarj.leetcode_top_interview_150.sortedarrtobt;

import com.github.yourarj.leetcode_top_interview_150.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void sortedArrayToBST01() {
    int[] input = {-10, -3, 0, 5, 9};
    TreeNode node = target.sortedArrayToBST(input);
    node.inOrder();
  }

  @Test
  void sortedArrayToBST02() {
    int[] input = {1, 3};
    TreeNode node = target.sortedArrayToBST(input);
    node.inOrder();
  }

  @Test
  void sortedArrayToBST03() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
    TreeNode node = target.sortedArrayToBST(input);
    node.inOrder();
  }
}
