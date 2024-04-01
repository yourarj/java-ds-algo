package com.github.yourarj.linkedlist;

public class CycleInLinkedList<T> {
  public boolean detectCycle(SimpleLinkedList<T> list) {
    if (list.head == null) {
      return false;
    }

    SimpleLinkedList.Node<T> slow = list.head;
    SimpleLinkedList.Node<T> fast = list.head.next == null ? null : list.head.next.next;

    while (slow != null && fast != null) {
      if (slow == fast) return true;

      slow = slow.next;
      if (fast.next != null) {
        fast = fast.next.next;
      } else {
        fast = null;
      }
    }
    return false;
  }
}
