package com.github.yourarj.linkedlist;

// NOTE: This is incomplete solution
public class ReverseNodeInKGroup {

  public ListNode reverseKGroup(ListNode head, int k) {
    if (k <= 1 || head == null || head.next == null) {
      return head;
    }

    ListNode prev = null;
    ListNode current = head;
    ListNode next = head.next;

    ListNode prevLastHead = null;
    ListNode lastHead = null;
    ListNode lastTail = null;

    while (true) {

      prev = null;

      boolean incompleteSubList = false;

      lastHead = current;

      int counter = 0;
      ListNode tempTail = current;
      for (; counter < k - 1; counter++) {
        if (tempTail == null) {
          break;
        }
        tempTail = tempTail.next;
      }

      // if remaining list is not multiple of k, we don't need to
      // reverse the remaining part.
      if (counter < k - 1) {
        prevLastHead.next = current;
        break;
      }

      for (int i = 0; current != null && i < k; i++) {
        ListNode tempNext = null == next ? null : next.next;
        current.next = prev;
        prev = current;
        if (null != next) {
          next.next = current;
        }
        current = next;
        next = tempNext;
      }
      // handle beginning of list
      if (prevLastHead != null) {
        prevLastHead.next = prev;
      } else {
        head = prev;
      }
      prevLastHead = lastHead;
    }
    return head;
  }
}
