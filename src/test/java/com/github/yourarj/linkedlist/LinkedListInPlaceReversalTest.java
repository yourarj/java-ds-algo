package com.github.yourarj.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListInPlaceReversalTest {
  private final LinkedListInPlaceReversal<Integer> target = new LinkedListInPlaceReversal<>();

  @Test
  void reverseLinkedList() {
    final SimpleLinkedList<Integer> list = new SimpleLinkedList<>(new Integer[] {1, 2, 3, 4, 5});
    System.out.printf("Before reversing the linked list: %s\n", list);
    target.reverseLinkedList(list);
    System.out.printf("Before reversing the linked list: %s\n", list);
    target.reverseLinkedList(list);
    System.out.printf("Before reversing the linked list: %s\n", list);
  }
}
