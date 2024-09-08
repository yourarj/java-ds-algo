package com.github.yourarj.leetcode_top_interview_150.rangeprinter;

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> list = new ArrayList<>();

    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == nums.length - 1 || (i + 1 < nums.length && Math.abs(nums[i + 1] - nums[i]) > 1)) {
        addToList(list, nums, start, i);
        start = i + 1;
      }
    }
    return list;
  }

  private void addToList(List<String> list, int[] nums, int start, int current) {
    if (start == current) {
      list.add(Integer.toString(nums[start]));
    } else {
      list.add(String.format("%d->%d", nums[start], nums[current]));
    }
  }
}
