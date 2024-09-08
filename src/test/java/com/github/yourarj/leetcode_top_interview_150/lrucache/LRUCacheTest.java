package com.github.yourarj.leetcode_top_interview_150.lrucache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCacheTest {

  @Test
  void test01() {
    // ["LRUCache","put","put","get","put","get","put","get","get","get"]
    // [[2],target.put(1, 1);,target.put(2, 2);,[1],target.put(3, 3);,[2],target.put(4,
    // 4);,[1],[3],[4]]

    final LRUCache target = new LRUCache(2);
    target.put(1, 1);
    target.put(2, 2);
    Assertions.assertEquals(target.get(1), 1);
    target.put(3, 3);
    Assertions.assertEquals(target.get(2), -1);
    target.put(4, 4);
    Assertions.assertEquals(target.get(1), -1);
    Assertions.assertEquals(target.get(3), 3);
    Assertions.assertEquals(target.get(4), 4);
  }

  @Test
  void test02() {
    // ["LRUCache","put","get","put","get","get"]
    // [[1],target.put(2, 1);,[2],target.put(3, 2);,[2],[3]]

    final LRUCache target = new LRUCache(1);
    target.put(2, 1);
    Assertions.assertEquals(target.get(2), 1);
    target.put(3, 2);
    Assertions.assertEquals(target.get(2), -1);
    Assertions.assertEquals(target.get(3), 2);
  }

  @Test
  void test03() {
    // ["LRUCache","put","get","put","get"]
    // [[1],[2,1],[2],[2,100],[2]]

    final LRUCache target = new LRUCache(1);

    target.put(2, 1);
    target.put(2, 100);
    Assertions.assertEquals(target.get(2), 100);
    Assertions.assertEquals(target.get(2), 100);
  }
}
