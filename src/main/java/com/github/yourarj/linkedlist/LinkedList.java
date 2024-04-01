package com.github.yourarj.linkedlist;

public class LinkedList<T> implements ILinkedList<T> {
  private int size;
  private Node<T> head;
  private Node<T> tail;

  @Override
  public String toString() {
    return "LinkedList{" + "size=" + size + ", head=" + head + ", tail=" + tail + '}';
  }

  private static class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return value + "->" + next;
    }
  }

  @Override
  public void insertFirst(T t) {
    Node<T> node = new Node<>(t);
    if (head == null) {
      head = node;
      tail = node;
      size++;
      return;
    }

    node.next = head;
    head = node;
    size++;
  }

  @Override
  public void insertLast(T t) {
    if (head == null) {
      insertFirst(t);
      return;
    }
    Node<T> node = new Node<>(t);
    tail.next = node;
    tail = node;
    size++;
  }

  @Override
  public void insert(int index, T t) {
    if (index > size - 1) {
      return;
    }

    if (head == null) {
      insertFirst(t);
    }

    Node<T> pointer = head;
    for (int i = 1; i < index; i++) {
      pointer = pointer.next;
    }
    Node<T> node = new Node<>(t);
    node.next = pointer.next;

    pointer.next = node;
    size++;
  }

  @Override
  public T removeFirst() {
    if (head == null) {
      return null;
    }

    if (head == tail) {
      T value = head.value;
      head = null;
      tail = null;
      size--;
      return value;
    }

    T val = head.value;
    head = head.next;
    size--;
    return val;
  }

  @Override
  public T removeLast() {
    if (tail == null) {
      return null;
    }

    if (head == tail) {
      T value = head.value;
      head = null;
      tail = null;
      size--;
      return value;
    }

    Node<T> node = head;
    while (node.next.next != null) {
      node = node.next;
    }
    T value = node.next.value;
    node.next = null;
    size--;
    return value;
  }

  @Override
  public T remove(int index) {
    if (size < 1 || index > size - 1) {
      return null;
    }

    if (index == size - 1) {
      return removeLast();
    }

    Node<T> node = head;
    for (int i = 1; i < index; i++) {
      node = node.next;
    }

    T value = node.next.value;
    node.next = node.next.next;
    return value;
  }
}
