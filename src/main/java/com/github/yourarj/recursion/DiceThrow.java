package com.github.yourarj.recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
  public static List<String> dice(final int target) {
    return recursiveDice("", target);
  }

  static List<String> recursiveDice(final String pr, final int target) {
    List<String> list = new ArrayList<>();

    if (target == 0) {
      list.add(pr);
      return list;
    }

    for (int i = 1; i <= 6 && i <= target; i++) {
      list.addAll(recursiveDice(pr + i, target - i));
    }

    return list;
  }
}
