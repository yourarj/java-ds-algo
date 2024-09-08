package com.github.yourarj.leetcode_top_interview_150.microsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraysWithSumK {

  public static List<int[]> findSubArraysWithSumK(int[] arr, int k) {
    // Map to store cumulative sum and list of indices where this sum occurs
    Map<Integer, List<Integer>> cumulativeSumMap = new HashMap<>();
    cumulativeSumMap.put(0, new ArrayList<>()); // Handle case when sub array starts from index 0
    cumulativeSumMap.get(0).add(-1);

    int cumulativeSum = 0;
    List<int[]> result = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      cumulativeSum += arr[i];

      // Check if there is a sub array with the target sum
      if (cumulativeSumMap.containsKey(cumulativeSum - k)) {
        List<Integer> startIndices = cumulativeSumMap.get(cumulativeSum - k);
        for (int startIndex : startIndices) {
          result.add(new int[] {startIndex + 1, i});
        }
      }

      // Add current cumulative sum to the map
      if (!cumulativeSumMap.containsKey(cumulativeSum)) {
        cumulativeSumMap.put(cumulativeSum, new ArrayList<>());
      }
      cumulativeSumMap.get(cumulativeSum).add(i);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, -1, -5, 2, 3, -2, 5, -3};
    int k = 3;
    List<int[]> subarrays = findSubArraysWithSumK(arr, k);

    System.out.println("Subarrays with sum " + k + ":");
    for (int[] subarray : subarrays) {
      System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
    }
  }
}
