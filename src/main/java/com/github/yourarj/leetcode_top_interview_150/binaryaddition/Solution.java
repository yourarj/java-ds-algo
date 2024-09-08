package com.github.yourarj.leetcode_top_interview_150.binaryaddition;

class Solution {
  public String addBinary(String a, String b) {
    int index = 0, carry = 0;
    StringBuilder addition = new StringBuilder();

    for (; a.length() - index > 0 && b.length() - index > 0; index++) {
      int left = a.charAt(a.length() - index - 1) - '0';
      int right = b.charAt(b.length() - index - 1) - '0';
      carry = add(left, right, carry, addition);
    }

    for (; a.length() - index > 0; index++) {
      int left = a.charAt(a.length() - index - 1) - '0';
      carry = add(left, 0, carry, addition);
    }

    for (; b.length() - index > 0; index++) {
      int right = b.charAt(b.length() - index - 1) - '0';
      carry = add(0, right, carry, addition);
    }

    if (carry == 1) {
      addition.insert(0, '1');
    }
    return addition.toString();
  }

  private int add(int a, int b, int carry, StringBuilder sb) {
    char cur;
    switch (a + b + carry) {
      case 3:
        cur = '1';
        carry = 1;
        break;
      case 2:
        cur = '0';
        carry = 1;
        break;
      case 1:
        cur = '1';
        carry = 0;
        break;
      default:
        cur = '0';
        carry = 0;
    }
    sb.insert(0, cur);
    return carry;
  }
}
