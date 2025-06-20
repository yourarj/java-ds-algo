package com.github.yourarj.gfg_amzn_sde_dsa.tree.left_view_of_tree;

import com.github.yourarj.gfg_amzn_sde_dsa.tree.common.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

  @Test
  void leftViewTest_01() {
    final Node<Integer> root = Node.fromArray(new Integer[]{1, 2, 3, 4, 5, null, null});
    final List<Integer> expected = List.of(1, 2, 4);
    final List<Integer> actual = Solution.leftView(root);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void leftViewTest_02() {
    final Node<Integer> root = Node.fromArray(new Integer[]{1, 2, 3, null, null, 4, null, null, null, null, null,5});
    final List<Integer> expected = List.of(1, 2, 4, 5);
    final List<Integer> actual = Solution.leftView(root);
    Assertions.assertIterableEquals(expected, actual);
  }
}
