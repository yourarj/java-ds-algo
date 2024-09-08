package com.github.yourarj.leetcode_top_interview_150.stringsearch;

class Solution {
  public int strStr(String haystack, String needle) {
    long needleHash = calculateHash(needle);
    long startHash = calculateHash(haystack.substring(0, needle.length()));

    if (needleHash == startHash && isStringEqual(haystack, 0, needle)) {
      return 0;
    }
    ;

    for (int i = 1; i <= haystack.length() - needle.length(); i++) {
      startHash =
          updateHash(
              startHash,
              haystack.charAt(i - 1),
              haystack.charAt(i + needle.length() - 1),
              needle.length());
      if (startHash == needleHash && isStringEqual(haystack, i, needle)) {
        return i;
      }
    }

    return -1;
  }

  private boolean isStringEqual(String haystack, int start, String needle) {
    for (int i = start, j = 0; j < needle.length(); j++, i++) {
      if (haystack.charAt(i) != needle.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  private long calculateHash(String str) {
    long hash = 0;
    for (int i = 0; i < str.length(); i++) {
      hash += str.charAt(i) * Math.pow(257, i);
    }
    return hash;
  }

  private long updateHash(long prevHash, char prev, char next, int needleLength) {
    long newHash = (prevHash - prev) / 257;
    newHash = (long) (newHash + next * Math.pow(257, needleLength - 1));
    return newHash;
  }
}
