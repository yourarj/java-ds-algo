package com.github.yourarj.leetcode_top_interview_150.nextrightpointer2;

import org.junit.jupiter.api.Test;

class SolutionTest {
  private static Solution target = new Solution();

  @Test
  void connectTest01() {
    final Solution.TreeLinkNode four = new Solution.TreeLinkNode(4);
    final Solution.TreeLinkNode five = new Solution.TreeLinkNode(5);
    final Solution.TreeLinkNode seven = new Solution.TreeLinkNode(7);

    final Solution.TreeLinkNode two = new Solution.TreeLinkNode(2, four, five, null);
    final Solution.TreeLinkNode three = new Solution.TreeLinkNode(3, null, seven, null);

    final Solution.TreeLinkNode node = new Solution.TreeLinkNode(1, two, three, null);

    target.connect(node);

    System.out.println(node);
  }
}
