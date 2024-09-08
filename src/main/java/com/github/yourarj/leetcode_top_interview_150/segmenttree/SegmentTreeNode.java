package com.github.yourarj.leetcode_top_interview_150.segmenttree;

public class SegmentTreeNode {
  public int start;
  public int end;
  public long sum;
  public SegmentTreeNode left;
  public SegmentTreeNode right;

  public SegmentTreeNode(int start, int end, long sum) {
    this.start = start;
    this.end = end;
    this.sum = sum;
  }

  public void update(int location, int value) {
    if (location < this.start || location > this.end) return;
    if (this.start == location && this.end == location) {
      this.sum = value;
      return;
    }
    ;
    this.left.update(location, value);
    this.right.update(location, value);
    this.sum = this.left.sum + this.right.sum;
  }

  public long query(int start, int end) {
    if (this.start >= start && this.end <= end) return this.sum;
    if (end < this.start || start > this.end) return 0;

    return this.left.query(start, end) + this.right.query(start, end);
  }

  public static SegmentTreeNode constructSegmentTreeNode(int[] arr) {
    return constructTree(arr, 0, arr.length - 1);
  }

  private static SegmentTreeNode constructTree(int[] arr, int start, int end) {
    SegmentTreeNode current = new SegmentTreeNode(start, end, arr[start]);
    if (start == end) return current;

    int mid = start + (end - start) / 2;
    current.left = constructTree(arr, start, mid);
    current.right = constructTree(arr, mid + 1, end);
    current.sum = current.left.sum + current.right.sum;

    return current;
  }

  @Override
  public String toString() {
    return "STN{"
        + "rng= ["
        + start
        + ","
        + end
        + "], sum="
        + sum
        + ", left="
        + left
        + ", right="
        + right
        + '}';
  }
}
