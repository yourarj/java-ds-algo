package com.github.yourarj.linkedlist;

public interface ILinkedList<T> {
  void insertFirst(T t);

  void insertLast(T t);

  void insert(int index, T t);

  T removeFirst();

  T removeLast();

  T remove(int index);
}
