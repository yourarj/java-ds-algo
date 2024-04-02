package com.github.yourarj.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomCircularQueueTest {
  @Test
  void add() {
    CustomQueue stack = new CustomQueue();
    stack.add(10);
    stack.add(11);
    assertEquals(10, stack.peek());
  }

  @Test
  void pushIntoFull() {
    CustomQueue stack = new CustomQueue(1);
    stack.add(10);
    Exception ex = assertThrows(IllegalStateException.class, () -> stack.add(11));
    assertEquals("Queue is full!", ex.getMessage());
  }

  @Test
  void remove() {
    CustomQueue stack = new CustomQueue();
    stack.add(10);
    stack.add(11);
    stack.add(12);
    stack.add(13);
    stack.add(14);
    assertEquals(10, stack.remove());
    assertEquals(11, stack.remove());
    assertEquals(12, stack.remove());
    assertEquals(13, stack.remove());
    assertEquals(14, stack.remove());
    Exception ex = assertThrows(IllegalStateException.class, stack::remove);
    assertEquals("Queue is Empty!", ex.getMessage());
  }

  @Test
  void removeSingleElement() {
    CustomQueue stack = new CustomQueue();
    stack.add(10);
    assertEquals(10, stack.remove());
    Exception ex = assertThrows(IllegalStateException.class, stack::remove);
    assertEquals("Queue is Empty!", ex.getMessage());
  }

  @Test
  void removeFromTwoElementQueue() {
    CustomQueue stack = new CustomQueue();
    stack.add(10);
    stack.add(11);
    assertEquals(10, stack.remove());
    assertEquals(11, stack.remove());
    Exception ex = assertThrows(IllegalStateException.class, stack::remove);
    assertEquals("Queue is Empty!", ex.getMessage());
  }

  @Test
  void popFromEmpty() {
    CustomQueue stack = new CustomQueue(1);
    Exception ex = assertThrows(IllegalStateException.class, stack::remove);
    assertEquals("Queue is Empty!", ex.getMessage());
  }

  @Test
  void peek() {
    CustomQueue stack = new CustomQueue();
    stack.add(10);
    stack.add(11);
    assertEquals(10, stack.peek());
  }
}
