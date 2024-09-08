package com.github.yourarj.leetcode_top_interview_150.reverselinkedlist2;

import com.github.yourarj.leetcode_top_interview_150.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {
  private final Solution target = new Solution();

  @Test
  void reverseBetween01() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5});
    System.out.println(node.toString());
    int left = 2;
    int right = 4;
    ListNode result = target.reverseBetween(node, left, right);
    System.out.println(result.toString());
  }

  @Test
  void reverseBetween02() {
    ListNode node = new ListNode(new int[] {5});
    System.out.println(node.toString());
    int left = 1;
    int right = 1;
    ListNode result = target.reverseBetween(node, left, right);
    System.out.println(result.toString());
  }

  @Test
  void reverseBetween03() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5});
    System.out.println(node.toString());
    int left = 2;
    int right = 3;
    ListNode result = target.reverseBetween(node, left, right);
    System.out.println(result.toString());
  }

  @Test
  void reverseBetween04() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5});
    System.out.println(node.toString());
    int left = 2;
    int right = 2;
    ListNode result = target.reverseBetween(node, left, right);
    System.out.println(result.toString());
  }

  @Test
  void reverseBetween05() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5});
    System.out.println(node.toString());
    int left = 1;
    int right = 2;
    ListNode result = target.reverseBetween(node, left, right);
    System.out.println(result.toString());
  }

  @Test
  void reverseBetween06() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5});
    System.out.println(node.toString());
    int left = 1;
    int right = 5;
    ListNode result = target.reverseBetween(node, left, right);
    System.out.println(result.toString());
  }
}
