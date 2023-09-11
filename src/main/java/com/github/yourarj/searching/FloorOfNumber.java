package com.github.yourarj.searching;

import java.util.Optional;

public class FloorOfNumber {
  public Optional<Integer> floorOfNumber(int needle, int[] hayStack) {
    int start = 0;
    int end = hayStack.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (needle < hayStack[mid]) {
        end = mid - 1;
      } else if (needle > hayStack[mid]) {
        start = mid + 1;
      } else {
        return Optional.of(hayStack[mid]);
      }
    }
    return end < 0 ? Optional.empty() : Optional.of(hayStack[end]);
  }
}
