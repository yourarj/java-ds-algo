package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.merge_k_sorted_lists;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
  public static Node<Integer> mergeLists(Node<Integer>[] lists) {
    Node<Integer> dummy = new Node<>(-1, null), curr = null;
    final PriorityQueue<Node<Integer>> minHip = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

    for (Node<Integer> list : lists) {
      if (null != list) minHip.add(list);
    }

    curr = dummy;
    while (!minHip.isEmpty()) {
      Node<Integer> node = minHip.poll();
      curr.next = node;
      if (node.next != null) minHip.add(node.next);
      curr = node;
    }
    return dummy.next;
  }
}
