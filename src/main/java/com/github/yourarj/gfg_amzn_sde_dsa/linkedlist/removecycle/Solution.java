package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.removecycle;


import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;

public class Solution {
  public static Node<Integer> removeCycle(final Node<Integer> list) {
    if (list.next == null) return list;

    Node<Integer> slow = list, fast = list;

    slow = slow.next;
    fast = fast.next.next;

    while (null != fast && null != fast.next) {
      if (slow == fast) break;
      slow = slow.next;
      fast = fast.next.next;
    }

    if (slow == fast) {
      slow = list;
      if (slow != fast) {
        while (slow.next != fast.next) {
          slow = slow.next;
          fast = fast.next;
        }
      } else {
        while (fast.next != slow) {
          fast = fast.next;
        }
      }
      fast.next = null;
    }

    return list;
  }
}
