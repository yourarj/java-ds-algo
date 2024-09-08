package com.github.yourarj.leetcode_top_interview_150.removeduplicates2;

class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length < 3) return nums.length;

    int i = 2;
    for (int j = i; j < nums.length; j++) {
      if (nums[i - 2] != nums[j]) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }
}
