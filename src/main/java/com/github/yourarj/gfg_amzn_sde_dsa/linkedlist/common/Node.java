package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common;

import java.util.Iterator;
import java.util.Objects;

public class Node<T> implements Iterable<Node<T>> {
  public T val;
  public Node<T> next;

  public Node(T val, Node<T> next) {
    this.val = val;
    this.next = next;
  }

  public Node(final T[] arr) throws IllegalArgumentException {
    // validate the input arr
    if (null == arr || arr.length == 0) throw new IllegalArgumentException();

    Node<T> curr = new Node<T>(arr[arr.length - 1], null);
    for (int i = arr.length - 2; i >= 0; i--) {
      curr = new Node<>(arr[i], curr);
    }
    this.val = curr.val;
    this.next = curr.next;
  }

  public void addCycle(final T from) {
    Node<T> target = null, last = null;
    for (Node<T> node : this) {
      if (node.val == from) {
        target = node;
      }
      last = node;
    }
    last.next = target;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Node<?> node = (Node<?>) o;
    return Objects.equals(val, node.val);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(val);
  }

  @Override
  public String toString() {
    return "{" + val + '}';
  }

  @Override
  public Iterator<Node<T>> iterator() {
    return new NodeIterator<>(this);
  }
}
