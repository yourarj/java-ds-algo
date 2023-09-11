package com.github.yourarj.searching;

import java.util.Optional;

public class CeilingOfNumber {

  public Optional<Integer> findCeilingOfNumber(Integer needle, Integer[] haystack) {
    if (haystack.length == 0) return Optional.empty();

    int start = 0;
    int end = haystack.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (needle.compareTo(haystack[mid]) > 0) {
        start = mid + 1;
      } else if (needle.compareTo(haystack[mid]) < 0) {
        end = mid - 1;
      } else {
        return Optional.of(haystack[mid]);
      }
    }
    // when the condition breaks from above while
    // the start already points the larger
    return start == haystack.length ? Optional.empty() : Optional.of(haystack[start]);
  }
}
