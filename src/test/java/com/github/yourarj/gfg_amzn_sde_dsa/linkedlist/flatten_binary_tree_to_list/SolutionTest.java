package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.flatten_binary_tree_to_list;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.BTNode;
import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void flattenBT_Test_01() {
    final BTNode<Integer> root = new BTNode<>(new BTNode<>(new BTNode<>(null, null, 3), new BTNode<>(null, null, 4), 2), new BTNode<>(null, new BTNode<>(null, null, 6), 5), 1);

    final Node<Integer> expected = new Node<>(new Integer[]{1, 2, 3, 4, 5, 6});
    final Node<Integer> actual = Solution.flattenBT(root);

    Assertions.assertIterableEquals(expected, actual);
  }


  @Test
  void flattenBT_Test_02() {
    BTNode<Integer> five = new BTNode<>(null, null, 5);
    BTNode<Integer> two = new BTNode<>(null, five, 2);
    BTNode<Integer> four = new BTNode<>(two, null, 4);
    BTNode<Integer> three = new BTNode<>(null, null, 3);

    BTNode<Integer> root = new BTNode<>(three, four, 1);

    final Node<Integer> expected = new Node<>(new Integer[]{1, 3, 4, 2, 5});
    final Node<Integer> actual = Solution.flattenBT(root);

    Assertions.assertIterableEquals(expected, actual);
  }
}
