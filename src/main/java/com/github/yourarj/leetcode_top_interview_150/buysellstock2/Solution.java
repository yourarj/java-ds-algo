package com.github.yourarj.leetcode_top_interview_150.buysellstock2;

class Solution {
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    if (prices.length == 1) return maxProfit;

    int buyPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i - 1] > prices[i]) {
        maxProfit += prices[i - 1] - buyPrice;
        buyPrice = prices[i];
      } else if ((i == prices.length - 1 && prices[i] > buyPrice)) {
        maxProfit += prices[i] - buyPrice;
      }
    }
    return maxProfit;
  }
}
