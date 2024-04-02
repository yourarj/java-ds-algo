package com.github.yourarj.queue;

public class CustomQueue {
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;
  protected int back;

  public CustomQueue() {
    this(DEFAULT_SIZE);
  }

  public CustomQueue(int size) {
    this.data = new int[size];
  }

  public boolean add(int integer) {
    if (isFull()) {
      throw new IllegalStateException("Queue is full!");
    }
    data[back++] = integer;
    return true;
  }

  public boolean offer(int integer) {
    if (isFull()) {
      return false;
    }
    data[back++] = integer;
    return true;
  }

  public Integer remove() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is Empty!");
    }
    Integer value = data[0];
    if (back > 1) {
      System.arraycopy(data, 1, data, 0, back - 1);
    }
    back--;
    return value;
  }

  public Integer poll() {
    if (isEmpty()) {
      return null;
    }
    Integer value = data[0];
    System.arraycopy(data, 1, data, 0, back - 2);
    back--;
    return value;
  }

  public Integer element() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is Empty!");
    }
    return data[0];
  }

  public Integer peek() {
    if (isEmpty()) {
      return null;
    }
    return data[0];
  }

  protected boolean isFull() {
    return back == data.length;
  }

  protected boolean isEmpty() {
    return back == 0;
  }
}
