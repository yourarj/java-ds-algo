package com.github.yourarj.leetcode_top_interview_150.inttoroman;

class Solution {
  public String intToRoman(int num) {
    StringBuilder s = new StringBuilder();
    int index = 1;
    while (num > 0) {
      s.insert(0, getNumber((num % 10) * index));
      index *= 10;
      num /= 10;
    }
    return s.toString();
  }

  public String getNumber(int n) {
    StringBuilder s2 = new StringBuilder();
    while (n >= 1) {

      if (n >= 1000) {
        s2.append("M");
        n -= 1000;
      } else if (n >= 900) {
        s2.append("CM");
        n -= 900;
      } else if (n >= 500) {
        s2.append("D");
        n -= 500;
      } else if (n >= 400) {
        s2.append("CD");
        n -= 400;
      } else if (n >= 100) {
        s2.append("C");
        n -= 100;
      } else if (n >= 90) {
        s2.append("XC");
        n -= 90;
      } else if (n >= 50) {
        s2.append("L");
        n -= 50;
      } else if (n >= 40) {
        s2.append("XL");
        n -= 40;
      } else if (n >= 10) {
        s2.append("X");
        n -= 10;
      } else if (n == 9) {
        s2.append("IX");
        n -= 9;
      } else if (n >= 5) {
        s2.append("V");
        n -= 5;
      } else if (n == 4) {
        s2.append("IV");
        n -= 4;
      } else {
        s2.append("I");
        n -= 1;
      }
    }
    return s2.toString();
  }
}
