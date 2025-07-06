package com.github.yourarj.leetcode_top_interview_150.prob_238_product_of_array_excel_self;

public class Solution {
  public static int[] productExceptSelf(final int[] nums) {
    final int[] result = new int[nums.length];
    int prefix = 1;
    for (int i = 0; i < nums.length; i++) {
      result[i] = prefix;
      prefix *= nums[i];
    }

    prefix = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= prefix;
      prefix *= nums[i];
    }
    return result;
  }
}
