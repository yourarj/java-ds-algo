package com.github.yourarj.linkedlist;

public class LinkedListCycleLength<T> {

  public int findCycleLength(SimpleLinkedList<T> list) {
    if (null == list || list.head == null) {
      return 0;
    }

    SimpleLinkedList.Node<T> slow = list.head;
    SimpleLinkedList.Node<T> fast = slow.next == null ? null : slow.next.next;

    while (fast != null) {
      if (slow == fast) {
        int length = 0;
        do {
          slow = slow.next;
          length++;
        } while (slow != fast);
        return length;
      }
      slow = slow.next;
      fast = fast.next == null ? null : fast.next.next;
    }

    return 0;
  }
}
