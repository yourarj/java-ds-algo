package com.github.yourarj.leetcode_top_interview_150.segmenttree;

public class SegmentTreeLazy {
  public static class SGTLNode {
    long value;
    int start;
    int end;

    public SGTLNode(int start, int end) {
      this.start = start;
      this.end = end;
    }

    @Override
    public String toString() {
      return "SGTLNode{" + "value=" + value + ", start=" + start + ", end=" + end + '}';
    }
  }

  SGTLNode[] tree;
  int[] lazy;

  public SegmentTreeLazy(int[] arr) {
    final int SIZE = arr.length + arr.length - 1;
    this.lazy = new int[SIZE];
    this.tree = new SGTLNode[SIZE];
    this.tree[0] = constructTree(arr, this.tree, 0, arr.length - 1, 0);
  }

  private SGTLNode constructTree(int[] src, SGTLNode[] tree, int left, int right, int treeIndex) {
    SGTLNode node = new SGTLNode(left, right);
    if (right == left) {
      node.value = src[left];
      return node;
    }

    int mid = left + (right - left) / 2;

    tree[2 * treeIndex + 1] = constructTree(src, tree, left, mid, 2 * treeIndex + 1);
    tree[2 * treeIndex + 2] = constructTree(src, tree, mid + 1, right, 2 * treeIndex + 2);

    node.value = tree[2 * treeIndex + 1].value + tree[2 * treeIndex + 2].value;

    return node;
  }

  public long query(int start, int end) {
    return query(start, end, 0);
  }

  private long query(int start, int end, int index) {
    if (this.lazy[index] != 0) {
      this.tree[index].value += this.lazy[index];
      if (this.tree[index].start != this.tree[index].end) {
        this.lazy[2 * index + 1] += this.lazy[index];
        this.lazy[2 * index + 2] += this.lazy[index];
      }
      this.lazy[index] = 0;
    }
    if (start <= this.tree[index].start && end >= this.tree[index].end)
      return this.tree[index].value;
    if (this.tree[index].start > end || start > this.tree[index].end) return 0;
    return query(start, end, 2 * index + 1) + query(start, end, 2 * index + 2);
  }

  public long update(int start, int end, int value) {
    return update(start, end, value, 0);
  }

  private long update(int start, int end, int value, int index) {
    if (this.lazy[index] != 0) {
      this.tree[index].value += this.lazy[index];
      if (start != end) {
        this.lazy[2 * index + 1] += this.lazy[index];
        this.lazy[2 * index + 2] += this.lazy[index];
      }
      this.lazy[index] = 0;
    }
    if (start <= this.tree[index].start && end >= this.tree[index].end) {
      this.tree[index].value += (long) (this.tree[index].end - this.tree[index].start + 1) * value;
      if (this.tree[index].start != this.tree[index].end) {
        this.lazy[2 * index + 1] += value;
        this.lazy[2 * index + 2] += value;
      }
      return this.tree[index].value;
    }

    if (start > this.tree[index].end || end < this.tree[index].start) {
      return this.tree[index].value;
    }
    this.tree[index].value =
        this.update(start, end, value, 2 * index + 1)
            + this.update(start, end, value, 2 * index + 2);
    return this.tree[index].value;
  }
}
