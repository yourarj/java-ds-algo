package com.github.yourarj.leetcode_top_interview_150.lrucache;

class DLList {
  public int key;
  public int val;
  public DLList next;
  public DLList prev;

  public DLList(int key, int val) {
    this.key = key;
    this.val = val;
  }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj = new
 * LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
