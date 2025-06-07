package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.merge_k_sorted_lists;

import com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void mergeLists_Test_01() {
    final Node<Integer> head1 = new Node<>(new Integer[]{1, 3, 5, 7});
    final Node<Integer> head2 = new Node<>(new Integer[]{2, 4, 6, 8});
    final Node<Integer> head3 = new Node<>(new Integer[]{0, 9, 10, 11});

    final Node<Integer> expected = new Node<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});

    final Node<Integer> actual = Solution.mergeLists(new Node[]{head1, head2, head3});

    Assertions.assertIterableEquals(expected, actual);
  }
}
