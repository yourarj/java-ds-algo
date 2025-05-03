package com.github.yourarj.leetcode_top_interview_150.prob_210_course_schedule_II;

import java.util.*;

class Solution {
  public int[] findOrder(int numCourses, int[][] prerequisites) {

    final List<List<Integer>> graph = new ArrayList<>(numCourses);

    // initialize graph
    for (int i = 0; i < numCourses; i++) {
      graph.add(new ArrayList<>());
    }
    // construct graph from prerequisites
    for (int[] entry : prerequisites) {
      graph.get(entry[0]).add(entry[1]);
    }

    final Set<Integer> globalVisited = new HashSet<>(numCourses, 1.0F);
    final Set<Integer> currentVisited = new HashSet<>(numCourses, 1.0F);

    Queue<Integer> currentOrder = new ArrayDeque<>();

    for (int i = 0; i < numCourses; i++) {
      currentVisited.clear();

      if (getSequence(i, graph, globalVisited, currentVisited, currentOrder)) {
        // loop found return empty array
        return new int[]{};
      }
    }

    // FIXME: Need to return actual answer
    return currentOrder.stream().mapToInt(value -> value).toArray();
  }

  private boolean getSequence(Integer current, List<List<Integer>> graph, Set<Integer> visited, Set<Integer> currentVisited, Queue<Integer> currentOrder) {
    visited.add(current);
    currentVisited.add(current);

    for (Integer dep : graph.get(current)) {
      if (!visited.contains(dep) && getSequence(dep, graph, visited, currentVisited, currentOrder) || currentVisited.contains(dep)) {
        // loop found returned
        return true;
      }
    }
    currentVisited.remove(current);

    // only add if not part of it
    if (!currentOrder.contains(current)) currentOrder.add(current);
    return false;
  }
}
