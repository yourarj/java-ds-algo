package com.github.yourarj.leetcode_top_interview_150.threesum;

import java.util.*;

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    Set<List<Integer>> lists = new HashSet<>();

    if (nums[0] > 0 || nums[nums.length - 1] < 0) return new ArrayList<>();

    for (int i = 0; i <= nums.length - 3; i++) {

      int first = nums[i];
      int wanted = first * -1;
      int current = 0;
      for (int l = i + 1, r = nums.length - 1; l < r; ) {
        int sum = nums[l] + nums[r];
        if (sum == wanted) {
          List<Integer> list = new ArrayList<>();
          list.add(nums[i]);
          list.add(nums[l]);
          list.add(nums[r]);

          lists.add(list);
          l++;
        } else if (sum > wanted) {
          r--;
        } else {
          l++;
        }
      }
    }
    return new ArrayList<>(lists);
  }
}
