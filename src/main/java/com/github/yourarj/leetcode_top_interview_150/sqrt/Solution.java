package com.github.yourarj.leetcode_top_interview_150.sqrt;

class Solution {
  public int mySqrt(int x) {
    if (x < 2) return x;
    return sqrtRec(x, 1, x);
  }

  private int sqrtRec(long x, int l, int r) {
    if (l > r) return l - 1;

    int mid = l + (r - l) / 2;
    long midsq = (long) mid * mid;
    if (midsq == x) {
      return mid;
    } else if (midsq > x) {
      return sqrtRec(x, l, mid - 1);
    } else {
      return sqrtRec(x, mid + 1, r);
    }
  }
}
