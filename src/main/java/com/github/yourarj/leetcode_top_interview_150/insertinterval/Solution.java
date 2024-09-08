package com.github.yourarj.leetcode_top_interview_150.insertinterval;

class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    int leftStart = findIndex(intervals, 0, intervals.length - 1, newInterval[0]);
    int rightStart = findIndex(intervals, leftStart, intervals.length - 1, newInterval[1]);

    System.out.printf("leftStart: %d, rightStart: %d\n", leftStart, rightStart);
    // it's not larger than one interval, return as is
    if (rightStart >= 0 && leftStart == rightStart) return intervals;

    int[][] newIntervals = new int[intervals.length - (rightStart - leftStart)][];
    int start = -1;
    for (int i = 0; i < intervals.length; i++) {
      if (i == leftStart) {
        start = intervals[i][0];
      }
    }
    return intervals;
  }

  private int findIndex(int[][] intervals, int left, int right, int index) {
    if (left > right) {
      return left * -1;
    }
    int mid = left + (right - left) / 2;
    if (intervals[mid][0] <= index && intervals[mid][1] >= index) {
      return mid;
    } else if (intervals[mid][0] > index) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }
    return findIndex(intervals, left, right, index);
  }
}
