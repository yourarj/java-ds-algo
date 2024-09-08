package com.github.yourarj.leetcode_top_interview_150.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
  private final Map<Integer, DLList> map;
  private final int capacity;
  private DLList head;
  private DLList tail;
  private int size;

  public LRUCache(int capacity) {
    map = new HashMap<>(capacity);
    this.capacity = capacity;
  }

  public int get(int key) {
    DLList obj = map.get(key);
    if (null == obj) {
      return -1;
    } else {
      moveToTail(obj);
    }
    return obj.val;
  }

  public void put(int key, int value) {
    if (size == capacity) {
      map.remove(head.key);
      head = head.next;
      if (head != null) head.prev = null;
    }
    DLList node = new DLList(key, value);
    moveToTail(node);
    map.put(key, node);
    size = Math.min(++size, capacity);
  }

  private void moveToTail(final DLList obj) {
    if (head == obj) head = head.next;
    if (obj.prev != null) obj.prev.next = obj.next;
    if (obj.next != null) obj.next.prev = obj.prev;
    if (tail != null) tail.next = obj;
    obj.prev = tail;
    tail = obj;
    if (head == null) head = obj;
  }
}
