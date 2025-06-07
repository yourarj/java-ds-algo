package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.flatten_binary_tree_to_list;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.BTNode;
import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;

import java.util.Stack;

/**
 * Just for practice have taken the iterative approach instead of the
 * recursive approach
 */
public class Solution {
  public static Node<Integer> flattenBT(final BTNode<Integer> tree) {
    final Stack<BTNode<Integer>> stack = new Stack<>();

    Node<Integer> node = null;

    BTNode<Integer> curr = tree, temp = null;

    while (null != curr || !stack.isEmpty()) {

      // traverse all right children
      while (curr != null) {
        stack.push(curr);
        curr = curr.right;
      }

      temp = stack.peek().left;

      if (temp != null) {
        // if the top of stack has left child
        curr = temp;
      } else {
        temp = stack.pop();
        node = new Node<>(temp.val, node);
        while (!stack.isEmpty() && temp == stack.peek().left) {
          temp = stack.pop();
          node = new Node<>(temp.val, node);
        }
      }
    }
    return node;
  }
}
