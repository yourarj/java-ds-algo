package com.github.yourarj.linkedlist;

public class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode(int[] arr) {
    ListNode current = null;
    for (int i = arr.length - 1; i > 0; i--) {
      current = new ListNode(arr[i], current);
    }
    this.val = arr[0];
    this.next = current;
  }

  private boolean hasCycle() {
    if (this.next == null) {
      return false;
    }

    ListNode slow = this;
    ListNode fast = this.next.next;

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

  @Override
  public String toString() {
    return val + "->" + (next == null ? "END" : next.hasCycle() ? "HAS_CYCLE" : next);
  }
}
