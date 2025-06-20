package com.github.yourarj.gfg_amzn_sde_dsa.tree.left_view_of_tree;

import com.github.yourarj.gfg_amzn_sde_dsa.tree.common.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static List<Integer> leftView(final Node<Integer> root) {
    final List<Integer> view = new ArrayList<>();
    recLeftView(root, view, 1);
    return view;
  }

  private static void recLeftView(final Node<Integer> node, final List<Integer> view, final int depth) {
    if (null == node) return;

    if (view.size() < depth) {
      view.add(node.val);
    }

    recLeftView(node.left, view, depth + 1);
    recLeftView(node.right, view, depth + 1);
  }
}
