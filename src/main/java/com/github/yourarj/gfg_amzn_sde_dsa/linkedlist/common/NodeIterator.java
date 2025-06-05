package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common;

import java.util.Iterator;

class LinkedListIterator<T> implements Iterator<Node<T>> {
  private Node<T> curr;

  public LinkedListIterator(Node<T> curr) {
    this.curr = curr;
  }

  @Override
  public boolean hasNext() {
    return curr != null;
  }

  @Override
  public Node<T> next() {
    final Node<T> temp = curr;
    curr = curr.next;
    return temp;
  }
}
