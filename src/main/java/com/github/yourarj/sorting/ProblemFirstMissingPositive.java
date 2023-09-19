package com.github.yourarj.sorting;

public class ProblemFirstMissingPositive {
  public int firstMissingPositive(int[] nums) {
    for (int i = 0; i < nums.length; ) {
      if (nums[i] > 0 && nums[i] < nums.length && i + 1 != nums[i]) {
        if (nums[i] == nums[nums[i] - 1]) {
          i++;
        } else {
          int temp = nums[nums[i] - 1];
          nums[nums[i] - 1] = nums[i];
          nums[i] = temp;
        }
      } else {
        i++;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    return nums.length + 1;
  }
}
