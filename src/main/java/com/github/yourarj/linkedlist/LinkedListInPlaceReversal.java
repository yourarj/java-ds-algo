package com.github.yourarj.linkedlist;

public class LinkedListInPlaceReversal<T> {

  public void reverseLinkedList(SimpleLinkedList<T> list) {

    if (null == list || list.head == null || list.head.next == null) {
      return;
    }

    SimpleLinkedList.Node<T> tempHead = list.head;
    SimpleLinkedList.Node<T> tempTail = list.tail;

    SimpleLinkedList.Node<T> prev = null;
    SimpleLinkedList.Node<T> current = list.head;
    SimpleLinkedList.Node<T> next = list.head.next;

    while (next != null) {
      // reverse both references
      SimpleLinkedList.Node<T> temp = next.next;
      next.next = current;
      current.next = prev;

      // move forward
      prev = current;
      current = next;
      next = temp;
    }

    list.head = tempTail;
    list.tail = tempHead;
  }
}
