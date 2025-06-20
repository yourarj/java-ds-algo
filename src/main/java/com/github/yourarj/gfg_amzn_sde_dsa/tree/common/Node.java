package com.github.yourarj.gfg_amzn_sde_dsa.tree.common;

public class Node<T> {
  public Node<T> left;
  public Node<T> right;
  public T val;

  public Node(Node<T> left, Node<T> right, T val) {
    this.left = left;
    this.right = right;
    this.val = val;
  }

  public Node(T val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return "{" + val + '}';
  }

  /**
   * Create Tree from the array where
   * children of node at n are assumed to be situated at
   * left = 2n+1
   * right = 2n+2
   *
   * @param arr array
   * @param <T> Type
   * @return root of the tree
   */
  public static <T> Node<T> fromArray(final T[] arr) {
    return recFromArray(arr, 0);
  }

  private static <T> Node<T> recFromArray(final T[] arr, final int index) {
    if (index >= arr.length || arr[index] == null) return null;
    final Node<T> node = new Node<>(arr[index]);
    node.left = recFromArray(arr, 2 * index + 1);
    node.right = recFromArray(arr, 2 * index + 2);
    return node;
  }


}
