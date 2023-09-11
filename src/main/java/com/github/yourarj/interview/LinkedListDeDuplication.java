package com.github.yourarj.interview;

import java.util.Objects;

/** Deduplicate a linked list e.g. input: 1 -> 1 -> 1 -> 2 -> 3 -> 3 -> 4 output: 2 -> 4 */
public class LinkedListDeDuplication {
  /** Singly Linked List Node */
  public static class SllNode {
    private final int value;
    private SllNode next;

    public SllNode(int value, SllNode next) {
      this.value = value;
      this.next = next;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SllNode sllNode = (SllNode) o;
      return Objects.equals(value, sllNode.value);
    }

    @Override
    public int hashCode() {
      return Objects.hash(value);
    }

    @Override
    public String toString() {
      String next = this.next != null ? this.next.toString() : "";
      return value + "->" + next;
    }

    /**
     * Construct a Singly Linked list from an array
     * It's just a convenience method
     * @param members array
     * @return SllNode
     */
    public static SllNode newFromArray(int[] members) {
      SllNode head = null;
      SllNode current = null;

      for (int i = 0; i < members.length; i++) {
        SllNode node = new SllNode(members[i], null);
        if (i == 0) {
          head = node;
        } else {
          current.next = node;
        }
        current = node;
      }
      return head;
    }
  }

  /**
   * de-duplicated elements from singly linked list
   * @param head possible duplicated sorted linked list
   * @return de-duplicated list
   */
  public SllNode deduplicateLinkedList(SllNode head) {
    SllNode newHead = null;
    SllNode prevUnique = null;

    SllNode prev = null;
    SllNode current = head;

    while (current != null) {
      if (!current.equals(current.next) && !current.equals(prev)) {
        if (newHead == null) {
          newHead = current;
          prevUnique = current;
        } else {
          prevUnique.next = current;
        }
      }
      prev = current;
      current = current.next;
    }
    return newHead;
  }
}
