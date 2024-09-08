package com.github.yourarj.leetcode_top_interview_150.groupanagram;

import java.util.*;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);

      map.putIfAbsent(sorted, new ArrayList<>());
      map.get(sorted).add(s);
    }
    return new ArrayList<>(map.values());
  }
}
