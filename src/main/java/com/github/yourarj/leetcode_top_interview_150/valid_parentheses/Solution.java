package com.github.yourarj.leetcode_top_interview_150.valid_parentheses;

import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (stack.isEmpty() || stack.peek() != getComplement(c)) {
        return false;
      } else {
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  public char getComplement(char c) {
    return switch (c) {
      case '(' -> ')';
      case ')' -> '(';
      case '[' -> ']';
      case ']' -> '[';
      case '{' -> '}';
      case '}' -> '{';
      default -> throw new IllegalStateException();
    };
  }
}
