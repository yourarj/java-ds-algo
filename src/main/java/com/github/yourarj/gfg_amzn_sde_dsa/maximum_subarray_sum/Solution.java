package com.github.yourarj.gfg_amzn_sde_dsa.maximum_subarray_sum;

public class Solution {
  public static int maxSubarraySUm(final int[] arr) {
    // handle if arr is null or has no elements
    if (null == arr || arr.length == 0) return 0;

    // assign first element as maxSum
    int maxSum = arr[0];

    int currSum = arr[0];
    for (int i = 1; i < arr.length; i++) {
      currSum += arr[i];
      currSum = Math.max(currSum, arr[i]);
      maxSum = Math.max(currSum, maxSum);

    }

    return maxSum;
  }
}
