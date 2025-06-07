package com.github.yourarj.gfg_amzn_sde_dsa.linkedlist.common;

public class BTNode<T> {
  public BTNode<T> left;
  public BTNode<T> right;
  public T val;

  public BTNode(BTNode<T> left, BTNode<T> right, T val) {
    this.left = left;
    this.right = right;
    this.val = val;
  }

  public BTNode(T val) {
    this.val = val;
  }

  @Override
  public String toString() {
    return "{" + val + '}';
  }

}
