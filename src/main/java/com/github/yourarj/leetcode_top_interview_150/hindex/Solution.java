package com.github.yourarj.leetcode_top_interview_150.hindex;

class Solution {
  public int hIndex(int[] citations) {
    // storing in a new arr updating it if it has that citations
    int[] freq = new int[citations.length + 1];
    for (int i : citations) {
      if (i > freq.length - 1) {
        freq[freq.length - 1]++;
      } else {
        freq[i]++;
      }
      // We got arr[1,1,_,1,_,2]
    }
    int sum = 0;
    // Checking citations
    for (int i = freq.length - 1; i >= 0; i--) {
      sum += freq[i];
      if (sum >= i) {
        return i;
      }
    }
    return 0;
  }
}
