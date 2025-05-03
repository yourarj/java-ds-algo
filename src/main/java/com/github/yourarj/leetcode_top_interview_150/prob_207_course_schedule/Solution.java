package com.github.yourarj.leetcode_top_interview_150.prob_207_course_schedule;

import java.util.*;

class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    final List<Integer>[] graph = new ArrayList[numCourses];

    // initialize array
    for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList<>();

    // visited set
    final Set<Integer> visited = new HashSet<>();

    // visited set
    final Stack<Integer> currVisited = new Stack<>();

    // populate graph
    for (int[] prerequisite : prerequisites) graph[prerequisite[1]].add(prerequisite[0]);

    for (int i = 0; i < numCourses; i++) {
      currVisited.clear();

      if (dfs(i, graph, visited, currVisited)) return false;
    }
    return true;
  }

  private boolean dfs(int current, List<Integer>[] graph, Set<Integer> visited, Stack<Integer> currVisited) {
    visited.add(current);
    currVisited.push(current);

    for (Integer next : graph[current]) {
      if (!visited.contains(next)) {
        if (dfs(next, graph, visited, currVisited)) return true;
      } else if (currVisited.contains(next)) {
        return true;
      }
    }

    currVisited.pop();
    return false;
  }
}
