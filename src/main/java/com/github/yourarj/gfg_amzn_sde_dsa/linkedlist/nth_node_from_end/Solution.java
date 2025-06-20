package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.nth_node_from_end;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;

public class Solution {
  public static Integer nthNodeFromEnd(final Node<Integer> list, final int N) {
    Node<Integer> back = null, front = list;

    for (int i = 0; i < N; i++) {
      if (front == null) {
        return -1;
      }
      front = front.next;
    }
    // assign back to beginning
    back = list;

    while (front != null) {
      front = front.next;
      back = back.next;
    }

    return null == back ? -1 : back.val;
  }
}
