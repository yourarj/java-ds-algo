package com.github.yourarj.recursion;

public class SkipCharacter {
  public String skipACharacter(String input, char c) {
    StringBuilder builder = new StringBuilder();
    skipAChar(builder, input, c);
    return builder.toString();
  }

  void skipAChar(StringBuilder builder, String input, char c) {
    if (input.isEmpty()) {
      return;
    }
    if (input.charAt(0) != c) {
      builder.append(input.charAt(0));
    }
    skipAChar(builder, input.substring(1), c);
  }
}
