package com.github.yourarj.recursion;

public class SkipString {
  public String skipACharacter(String input, String str) {
    StringBuilder builder = new StringBuilder();
    skipAChar(builder, input, str);
    return builder.toString();
  }

  void skipAChar(StringBuilder builder, String input, String str) {
    if (input.isEmpty()) {
      return;
    }
    if (!input.startsWith(str)) {
      builder.append(input.charAt(0));
      skipAChar(builder, input.substring(1), str);
    } else {
      skipAChar(builder, input.substring(str.length()), str);
    }
  }
}
