package com.github.yourarj.queue;

public class CustomCircularQueue implements ICustomQueue {
  private static final int DEFAULT_SIZE = 10;
  private final int[] data;
  private int front;
  private int back;

  public CustomCircularQueue() {
    this(DEFAULT_SIZE);
  }

  public CustomCircularQueue(int defaultSize) {
    data = new int[defaultSize];
  }

  @Override
  public boolean add(int integer) {
    if (isFull()) {
      throw new IllegalStateException("Queue is full!");
    }
    data[front] = integer;
    front = (front + 1) % data.length;
    return true;
  }

  @Override
  public boolean offer(int integer) {
    if (isFull()) {
      return false;
    }
    data[front] = integer;
    front = (front + 1) % data.length;
    return true;
  }

  @Override
  public Integer remove() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is Empty!");
    }
    back = (back + 1) % data.length;
    return data[back];
  }

  @Override
  public Integer poll() {
    if (isEmpty()) {
      return null;
    }
    back = (back + 1) % data.length;
    return data[back];
  }

  @Override
  public Integer element() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is Empty!");
    }

    return data[(back - 1 + data.length) % data.length];
  }

  @Override
  public Integer peek() {
    if (isEmpty()) {
      return null;
    }
    return data[0];
  }

  private final boolean isEmpty() {
    return front == back;
  }

  private final boolean isFull() {
    return front != back;
  }
}
