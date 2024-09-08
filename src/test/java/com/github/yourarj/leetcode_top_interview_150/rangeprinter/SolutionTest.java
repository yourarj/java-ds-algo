package com.github.yourarj.leetcode_top_interview_150.rangeprinter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
  Solution target = new Solution();

  @Test
  void summaryRanges() {
    int[] input = new int[] {-2147483648, -2147483647, 2147483647};
    List<String> list = List.of("-2147483648->-2147483647", "2147483647");
    List<String> expected = target.summaryRanges(input);
    assertIterableEquals(expected, list);
  }
}
