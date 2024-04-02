package com.github.yourarj.stack;

public class CustomStack {
  private final int[] data;
  private int top;
  private static final int DEFAULT_SIZE = 10;

  public CustomStack() {
    this(DEFAULT_SIZE);
  }

  public CustomStack(int size) {
    this.data = new int[size];
  }

  public int push(int item) throws IllegalStateException {
    if (isFull()) {
      throw new IllegalStateException("Stack is already full!");
    }
    data[top++] = item;
    return item;
  }

  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is already Empty!");
    }
    return data[--top];
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is already Empty!");
    }
    return data[top - 1];
  }

  protected boolean isFull() {
    return top == data.length;
  }

  protected boolean isEmpty() {
    return top == 0;
  }
}
