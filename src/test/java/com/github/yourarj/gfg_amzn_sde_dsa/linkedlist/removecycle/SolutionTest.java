package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.removecycle;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void removeCycle_Test_01() {
    final Node<Integer> node = new Node<Integer>(new Integer[]{1, 2, 3, 4, 5});
    node.addCycle(3);
    final Node<Integer> expected = new Node<Integer>(new Integer[]{1, 2, 3, 4, 5});
    final Node<Integer> actual = Solution.removeCycle(node);

    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void removeCycle_Test_02() {
    final Node<Integer> node = new Node<Integer>(new Integer[]{1, 2, 3, 4, 5});
    node.addCycle(1);
    final Node<Integer> expected = new Node<Integer>(new Integer[]{1, 2, 3, 4, 5});
    final Node<Integer> actual = Solution.removeCycle(node);

    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void removeCycle_Test_03() {
    final Node<Integer> node = new Node<Integer>(new Integer[]{1});
    node.addCycle(1);
    final Node<Integer> expected = new Node<Integer>(new Integer[]{1});
    final Node<Integer> actual = Solution.removeCycle(node);

    Assertions.assertIterableEquals(expected, actual);
  }
}
