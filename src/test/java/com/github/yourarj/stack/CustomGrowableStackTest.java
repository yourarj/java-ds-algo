package com.github.yourarj.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomGrowableStackTest {
  @Test
  void push() {
    CustomGrowableStack stack = new CustomGrowableStack();
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.peek());
  }

  @Test
  void pushIntoFull() {
    CustomGrowableStack stack = new CustomGrowableStack(1);
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.peek());
  }

  @Test
  void pop() {
    CustomGrowableStack stack = new CustomGrowableStack();
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.pop());
    assertEquals(10, stack.pop());
  }

  @Test
  void popFromEmpty() {
    CustomGrowableStack stack = new CustomGrowableStack(1);
    Exception ex = assertThrows(IllegalStateException.class, stack::pop);
    assertEquals("Stack is already Empty!", ex.getMessage());
  }

  @Test
  void peek() {
    CustomGrowableStack stack = new CustomGrowableStack();
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.peek());
  }
}
