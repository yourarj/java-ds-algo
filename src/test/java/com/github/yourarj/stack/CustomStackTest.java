package com.github.yourarj.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomStackTest {

  @Test
  void push() {
    CustomStack stack = new CustomStack();
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.peek());
  }

  @Test
  void pushIntoFull() {
    CustomStack stack = new CustomStack(1);
    stack.push(10);
    Exception ex = assertThrows(IllegalStateException.class, () -> stack.push(11));
    assertEquals("Stack is already full!", ex.getMessage());
  }

  @Test
  void pop() {
    CustomStack stack = new CustomStack();
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.pop());
    assertEquals(10, stack.pop());
  }

  @Test
  void popFromEmpty() {
    CustomStack stack = new CustomStack(1);
    Exception ex = assertThrows(IllegalStateException.class, stack::pop);
    assertEquals("Stack is already Empty!", ex.getMessage());
  }

  @Test
  void peek() {
    CustomStack stack = new CustomStack();
    stack.push(10);
    stack.push(11);
    assertEquals(11, stack.peek());
  }
}
