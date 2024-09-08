package com.github.yourarj.leetcode_top_interview_150.segmenttree;

import org.junit.jupiter.api.Test;

class SegmentTreeNodeTest {

  @Test
  void demo() {
    int[] arr = {1, 2, 3, 4, 5};
    SegmentTreeNode segTree = SegmentTreeNode.constructSegmentTreeNode(arr);

    System.out.printf("Sum(0,0): %03d\n", segTree.query(0, 0));
    System.out.printf("Sum(1,1): %03d\n", segTree.query(1, 1));
    System.out.printf("Sum(2,2): %03d\n", segTree.query(2, 2));
    System.out.printf("Sum(3,3): %03d\n", segTree.query(3, 3));
    System.out.printf("Sum(4,4): %03d\n", segTree.query(4, 4));
    System.out.printf("Sum(0,1): %03d\n", segTree.query(0, 1));
    System.out.printf("Sum(0,2): %03d\n", segTree.query(0, 2));
    System.out.printf("Sum(0,3): %03d\n", segTree.query(0, 3));
    System.out.printf("Sum(0,4): %03d\n", segTree.query(0, 4));

    segTree.update(4, 10);
    System.out.printf("Sum(0,4): %03d\n", segTree.query(0, 4));
    System.out.printf("Sum(4,4): %03d\n", segTree.query(4, 4));
  }
}
