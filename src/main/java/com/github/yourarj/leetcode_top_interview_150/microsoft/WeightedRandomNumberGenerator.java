package com.github.yourarj.leetcode_top_interview_150.microsoft;

import java.util.Random;

public class WeightedRandomNumberGenerator {
  private final int[] weightPrefixSum;
  private final Random random = new Random();

  public WeightedRandomNumberGenerator(int[] weights) {
    weightPrefixSum = new int[weights.length];
    weightPrefixSum[0] = weights[0];
    for (int i = 1; i < weights.length; i++) {
      weightPrefixSum[i] = weightPrefixSum[i - 1] + weights[i];
    }
  }

  public int getWeightedRandom() {
    int num = random.nextInt(weightPrefixSum[weightPrefixSum.length - 1]);
    return getIndex(num, 0, weightPrefixSum.length - 1);
  }

  private int getIndex(int randomNum, int left, int right) {
    if (left > right) return left;
    int mid = left + (right - left) / 2;
    if (weightPrefixSum[mid] == randomNum) return mid;
    else if (weightPrefixSum[mid] < randomNum) left = mid + 1;
    else right = mid - 1;
    return getIndex(randomNum, left, right);
  }
}
