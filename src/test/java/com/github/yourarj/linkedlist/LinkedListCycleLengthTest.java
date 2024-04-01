package com.github.yourarj.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleLengthTest {
  private final LinkedListCycleLength<Integer> target = new LinkedListCycleLength<>();

  @Test
  void findCycleLength() {
    final SimpleLinkedList<Integer> list = new SimpleLinkedList<>(new Integer[] {1, 2, 3, 4, 5});
    list.createCycle(4);
    Assertions.assertEquals(1, target.findCycleLength(list));
  }
}
