package com.github.yourarj.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseNodeInKGroupTest {
  private final ReverseNodeInKGroup target = new ReverseNodeInKGroup();

  @Test
  void reverseKGroup() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
    node = target.reverseKGroup(node, 3);
  }

  @Test
  void reverseKGroupUseCastTwo() {
    ListNode node = new ListNode(new int[] {1, 2, 3, 4, 5, 6});
    node = target.reverseKGroup(node, 3);
  }
}
