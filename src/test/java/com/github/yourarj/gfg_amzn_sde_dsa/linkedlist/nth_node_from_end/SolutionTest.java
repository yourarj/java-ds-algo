package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.nth_node_from_end;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void nthNodeFromEnd_Test_01() {
    final Node<Integer> list = new Node<>(new Integer[]{1, 2, 3, 4});
    final int number = 3;
    final Integer expected = 2;
    final Integer actual = Solution.nthNodeFromEnd(list, number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nthNodeFromEnd_Test_02() {
    final Node<Integer> list = new Node<>(new Integer[]{35, 15, 4, 20});
    final int number = 4;
    final Integer expected = 35;
    final Integer actual = Solution.nthNodeFromEnd(list, number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nthNodeFromEnd_Test_03() {
    final Node<Integer> list = new Node<>(new Integer[]{35, 15, 4, 20});
    final int number = 5;
    final Integer expected = -1;
    final Integer actual = Solution.nthNodeFromEnd(list, number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nthNodeFromEnd_Test_04() {
    final Node<Integer> list = new Node<>(new Integer[]{35, 15, 4, 20});
    final int number = 1;
    final Integer expected = 20;
    final Integer actual = Solution.nthNodeFromEnd(list, number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void nthNodeFromEnd_Test_05() {
    final Node<Integer> list = null;
    final int number = 1;
    final Integer expected = -1;
    final Integer actual = Solution.nthNodeFromEnd(list, number);
    Assertions.assertEquals(expected, actual);
  }

}
