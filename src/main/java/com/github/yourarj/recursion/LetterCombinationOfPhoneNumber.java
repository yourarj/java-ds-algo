package com.github.yourarj.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

  private static final String[] mapping =
      new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public static List<String> letterCombinations(String digits) {
    return recursive("", digits);
  }

  private static List<String> recursive(String pr, String un) {
    List<String> result = new ArrayList<>();

    if (un.isEmpty()) {
      if (!pr.isEmpty()) {
        result.add(pr);
      }
      return result;
    }

    int num = un.charAt(0) - '0';
    mapping[num]
        .chars()
        .forEach(value -> result.addAll(recursive(pr + (char) value, un.substring(1))));
    return result;
  }
}
