package com.github.yourarj.leetcode_top_interview_150.segmenttree;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SegmentTreeLazyTest {

  @Test
  void testLazyTestTree() {
    int[] input = {1, 2, 3, 4, 5};
    SegmentTreeLazy lazy = new SegmentTreeLazy(input);
    System.out.printf("seg-tree: %s\n", Arrays.toString(lazy.tree));

    System.out.printf(
        "array : {%d, %d, %d, %d, %d}\n",
        lazy.query(0, 0), lazy.query(1, 1), lazy.query(2, 2), lazy.query(3, 3), lazy.query(4, 4));
    System.out.printf("(3,4): %d\n", lazy.query(3, 4));
    System.out.printf("(0,4): %d\n", lazy.query(0, 4));

    System.out.printf("update (3,4) by 10: %d\n", lazy.update(3, 4, 10));

    System.out.printf("(3,4): %d\n", lazy.query(3, 4));
    System.out.printf("(0,4): %d\n", lazy.query(0, 4));
    System.out.printf(
        "array : {%d, %d, %d, %d, %d}\n",
        lazy.query(0, 0), lazy.query(1, 1), lazy.query(2, 2), lazy.query(3, 3), lazy.query(4, 4));

    System.out.printf("update (1,3) by 15: %d\n", lazy.update(1, 3, 15));
    System.out.printf("(1,3): %d\n", lazy.query(1, 3));
    System.out.printf("(2,3): %d\n", lazy.query(1, 2));
    System.out.printf("(2,3): %d\n", lazy.query(2, 3));
    System.out.printf(
        "array : {%d, %d, %d, %d, %d}\n",
        lazy.query(0, 0), lazy.query(1, 1), lazy.query(2, 2), lazy.query(3, 3), lazy.query(4, 4));
    System.out.printf("update (0,2) by 15: %d\n", lazy.update(0, 2, 15));
    System.out.printf("(0,2): %d\n", lazy.query(0, 2));
    System.out.printf("update (0,4) by 15: %d\n", lazy.update(3, 4, 15));
    System.out.printf("(3,4): %d\n", lazy.query(3, 4));
    System.out.printf(
        "array : {%d, %d, %d, %d, %d}\n",
        lazy.query(0, 0), lazy.query(1, 1), lazy.query(2, 2), lazy.query(3, 3), lazy.query(4, 4));
    System.out.printf(
        "array : {%d, %d, %d, %d, %d}\n",
        lazy.query(0, 0), lazy.query(1, 1), lazy.query(2, 2), lazy.query(3, 3), lazy.query(4, 4));
  }
}
