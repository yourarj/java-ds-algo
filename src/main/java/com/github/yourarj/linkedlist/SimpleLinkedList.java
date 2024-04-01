package com.github.yourarj.linkedlist;

public class SimpleLinkedList<T> {
  public Node<T> head;
  public Node<T> tail;
  public int size;

  @Override
  public String toString() {
    return head.toString();
  }

  public static class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value, Node<T> next) {
      this.value = value;
      this.next = next;
    }

    public Node() {}

    public Node(T value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return this.value
          + "->"
          + ((this.next == null) ? "END" : (this.hasCycle() ? "HAS_CYCLE" : this.next.toString()));
    }

    private boolean hasCycle() {
      if (this.next == null) {
        return false;
      }

      SimpleLinkedList.Node<T> slow = this;
      SimpleLinkedList.Node<T> fast = this.next.next;

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

  public SimpleLinkedList(T[] arr) {
    this.size = arr.length;

    Node<T> current = null;
    for (int i = this.size - 1; i >= 0; i--) {
      current = new Node<>(arr[i], current);
      if (i == size - 1) {
        this.tail = current;
      }
      if (i == 0) {
        this.head = current;
      }
    }
  }

  public void createCycle(int index) {
    if (index > this.size - 1) {
      return;
    }
    Node<T> node = this.head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    tail.next = node;
  }
}
