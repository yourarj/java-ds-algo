package com.github.yourarj.gfg_amzn_sde_dsa.string.look_and_say_sequence;

public class Solution {
  public static String nextTerm(int n) {
    if (n == 1) return "1";

    String curr = "1";
    final StringBuilder next = new StringBuilder();
    int count;
    while (n > 1) {
      count = 1;
      for (int j = 1; j < curr.length(); j++) {
        if (curr.charAt(j) == curr.charAt(j - 1)) {
          count++;
        } else {
          // as we have seen different character let append the count
          // and the number itself
          next.append(count);
          // as we are in else branch that mean current char is different
          // that why while appending char consider j-1
          next.append(curr.charAt(j - 1));
          count = 1;
        }
      }

      // append last char/s
      next.append(count);
      next.append(curr.charAt(curr.length() - 1));

      curr = next.toString();
      next.setLength(0);
      n--;
    }
    return curr;
  }
}
