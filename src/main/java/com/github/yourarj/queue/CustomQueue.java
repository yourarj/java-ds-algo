package com.github.yourarj.queue;

public class CustomQueue implements ICustomQueue {
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;
  protected int back;

  public CustomQueue() {
    this(DEFAULT_SIZE);
  }

  public CustomQueue(int size) {
    this.data = new int[size];
  }

  @Override
  public boolean add(int integer) {
    if (isFull()) {
      throw new IllegalStateException("Queue is full!");
    }
    data[back++] = integer;
    return true;
  }

  @Override
  public boolean offer(int integer) {
    if (isFull()) {
      return false;
    }
    data[back++] = integer;
    return true;
  }

  @Override
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

  @Override
  public Integer poll() {
    if (isEmpty()) {
      return null;
    }
    Integer value = data[0];
    System.arraycopy(data, 1, data, 0, back - 2);
    back--;
    return value;
  }

  @Override
  public Integer element() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is Empty!");
    }
    return data[0];
  }

  @Override
  public Integer peek() {
    if (isEmpty()) {
      return null;
    }
    return data[0];
  }

  public boolean isFull() {
    return back == data.length;
  }

  public boolean isEmpty() {
    return back == 0;
  }
}
