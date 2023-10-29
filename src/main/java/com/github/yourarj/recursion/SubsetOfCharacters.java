package com.github.yourarj.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfCharacters {
  public List<String> subsets(String input) {
    return subsets("", input);
  }

  private List<String> subsets(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
      List<String> list = new ArrayList<>();
      if (!processed.isEmpty()) list.add(processed);
      return list;
    }
    List<String> left = subsets(processed + unprocessed.charAt(0), unprocessed.substring(1));
    List<String> right = subsets(processed, unprocessed.substring(1));
    left.addAll(right);
    return left;
  }
}
