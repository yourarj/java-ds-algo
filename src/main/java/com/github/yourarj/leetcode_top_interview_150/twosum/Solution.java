package com.github.yourarj.leetcode_top_interview_150.twosum;

class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int left = 0, right = numbers.length - 1;

    do {
      int sum = numbers[left] + numbers[right];
      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      }
    } while (numbers[left] + numbers[right] != target);
    return new int[] {left, right};
  }
}
