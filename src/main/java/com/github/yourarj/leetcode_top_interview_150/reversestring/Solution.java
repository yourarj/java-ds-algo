package com.github.yourarj.leetcode_top_interview_150.reversestring;

class Solution {
  public String reverseWords(String str) {
    StringBuilder s = new StringBuilder(str.trim());

    for (int right = s.length() - 1; right >= 0; ) {
      int space = s.lastIndexOf(" ", right);

      int left = space + 1;

      while (right > left) {
        char lChar = s.charAt(left);
        s.setCharAt(left, s.charAt(right));
        s.setCharAt(right, lChar);
        left++;
        right--;
      }
      right = space - 1;

      while (right >= 0 && s.charAt(right) == ' ') {
        s.deleteCharAt(right);
        right--;
      }
      if (right == left) break;
    }
    return s.reverse().toString();
  }
}
