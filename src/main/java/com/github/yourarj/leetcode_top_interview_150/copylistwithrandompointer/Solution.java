package com.github.yourarj.leetcode_top_interview_150.copylistwithrandompointer;

import java.util.HashMap;
import java.util.Map;

// Definition for a Node.
class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}

class Solution {
  public Node copyRandomList(Node head) {
    if (null == head) return head;

    Map<Node, Node> map = new HashMap<>();

    for (Node temp = head; temp != null; temp = temp.next) {
      Node n = new Node(temp.val);
      n.next = temp.next;
      n.random = temp.random;
      map.put(temp, n);
    }

    Node newList = null;
    for (Node temp = head, current = map.get(temp);
        temp != null;
        temp = temp.next, current = map.get(temp)) {
      if (null == newList) {
        newList = current;
      }
      current.next = map.get(temp.next);
      current.random = map.get(temp.random);
    }
    return newList;
  }
}
