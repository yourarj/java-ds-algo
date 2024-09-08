package com.github.yourarj.leetcode_top_interview_150.minsizesubarrsum;

class Solution {
  public int minSubArrayLen(int target, int[] nums) {
    int subs = Integer.MAX_VALUE;

    int sum = 0;
    boolean add_r = true;
    for (int l = 0, r = 0; r < nums.length; r++) {

      sum += nums[r];
      while (sum >= target) {
        subs = Math.min(subs, r - l + 1);
        sum -= nums[l];
        l++;
      }
    }
    return subs == Integer.MAX_VALUE ? 0 : subs;
  }
}
