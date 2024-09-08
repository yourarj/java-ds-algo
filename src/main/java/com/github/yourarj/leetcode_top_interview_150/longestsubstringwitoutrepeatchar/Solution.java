package com.github.yourarj.leetcode_top_interview_150.longestsubstringwitoutrepeatchar;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int lengthOfLongestSubstring(String s) {

    Map<Character, Integer> chars = new HashMap<>();
    int longest = 0;
    int left = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (chars.containsKey(c)) left = Math.max(chars.remove(c) + 1, left);

      longest = Math.max(longest, i - left + 1);
      chars.put(c, i);
    }
    return longest;
  }
}
