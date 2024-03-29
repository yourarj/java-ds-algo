package com.github.yourarj.recursion;

import java.util.ArrayList;

public class PermutationOfString {
  public static ArrayList<String> getPermutations(final String word) {
    ArrayList<String> result = new ArrayList<>();
    recursive("", word, result);
    return result;
  }

  private static void recursive(String processed, String unprocessed, ArrayList<String> result) {
    if (unprocessed.isEmpty()) {
      result.add(processed);
      return;
    }

    for (int i = 0; i <= processed.length(); i++) {
      recursive(
          processed.substring(0, i) + unprocessed.charAt(0) + processed.substring(i),
          unprocessed.substring(1),
          result);
    }
  }
}
