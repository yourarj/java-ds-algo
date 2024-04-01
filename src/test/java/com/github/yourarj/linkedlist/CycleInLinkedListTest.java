package com.github.yourarj.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CycleInLinkedListTest {
  private final CycleInLinkedList<Integer> cycleChecker = new CycleInLinkedList<>();

  @Test
  void detectCycle() {
    final SimpleLinkedList<Integer> list = new SimpleLinkedList<>(new Integer[] {1, 2, 3, 4, 5});
    list.createCycle(0);
    Assertions.assertTrue(cycleChecker.detectCycle(list));
  }

  @Test
  void detectCycleUseCase02() {
    final SimpleLinkedList<Integer> list = new SimpleLinkedList<>(new Integer[] {1, 2, 3, 4, 5});
    list.createCycle(2);
    Assertions.assertTrue(cycleChecker.detectCycle(list));
  }

  @Test
  void shouldReturnFalseWhenThereIsNoCycle() {
    final SimpleLinkedList<Integer> list = new SimpleLinkedList<>(new Integer[] {1, 2, 3, 4, 5});
    Assertions.assertFalse(cycleChecker.detectCycle(list));
  }
}
