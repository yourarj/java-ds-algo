package com.github.yourarj.gfg_amzn_sde_dsa.searching.first_and_last_occurrence;

import java.util.List;

enum Occurrence {
  FIRST,
  LAST
}

public class Solution {
  public static List<Integer> findFirstAndLastOccurrence(final int[] haystack, final int needle) {
    final int first = binSearch(haystack, needle, 0, haystack.length-1, Occurrence.FIRST);
    final int second = binSearch(haystack, needle, 0, haystack.length-1, Occurrence.LAST);
    return List.of(first, second);
  }

  private static int binSearch(final int[] haystack, final int needle, int low, int high, final Occurrence preference) {
    int mid, index = -1;
    while (low <= high) {
      mid = low + (high - low) / 2;

      if (haystack[mid] == needle) {
        index = mid;
        if (preference == Occurrence.FIRST) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else if (haystack[mid] > needle) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return index;
  }

}
