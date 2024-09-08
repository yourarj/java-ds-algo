package com.github.yourarj.leetcode_top_interview_150.palindrome;

class Solution {
  public boolean isPalindrome(String s) {
    String str = s.toLowerCase();
    // a-z:97-122 0-9:48-57

    int left = 0, right = s.length() - 1;
    while (left <= right) {
      while (left < str.length() && !isAlphaNumeric(str.charAt(left))) {
        left++;
      }

      while (right >= 0 && !isAlphaNumeric(str.charAt(right))) {
        right--;
      }

      if (left >= right) {
        break;
      } else if (str.charAt(left) != str.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

  private boolean isAlphaNumeric(char c) {
    return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
  }
}
