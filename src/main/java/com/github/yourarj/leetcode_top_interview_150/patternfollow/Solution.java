package com.github.yourarj.leetcode_top_interview_150.patternfollow;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean wordPattern(String pattern, String s) {

    // pattern is longer than string
    if (pattern.length() > s.length()) return false;

    Map<Character, String> m = new HashMap<>(pattern.length(), 1);
    int start = 0, i = 0;
    for (; i < pattern.length(); i++) {
      // if invalid start is found
      if (start > s.length() - 1) return false;

      char c = pattern.charAt(i);
      int wb = s.indexOf(' ', start);
      int end = wb == -1 ? s.length() : wb;
      String ss = s.substring(start, end);

      if (m.get(c) == null && !m.containsValue(ss)) {
        m.put(c, ss);
      }

      if (!m.get(c).equals(ss)) {
        return false;
      }

      start = end + 1;
    }
    return i == pattern.length() && start == s.length() + 1;
  }
}
