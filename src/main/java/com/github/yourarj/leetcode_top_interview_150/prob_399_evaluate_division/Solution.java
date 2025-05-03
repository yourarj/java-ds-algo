package com.github.yourarj.leetcode_top_interview_150.prob_399_evaluate_division;

import java.util.*;

class Solution {
  public double[] calcEquation(
      List<List<String>> equations, double[] values, List<List<String>> queries) {
    // Step 1: Build the graph
    Map<String, Map<String, Double>> graph = new HashMap<>();
    for (int i = 0; i < equations.size(); i++) {
      String u = equations.get(i).get(0);
      String v = equations.get(i).get(1);
      double value = values[i];

      graph.putIfAbsent(u, new HashMap<>());
      graph.putIfAbsent(v, new HashMap<>());
      graph.get(u).put(v, value);
      graph.get(v).put(u, 1.0 / value);
    }

    // Step 2: Process each query
    double[] results = new double[queries.size()];
    for (int i = 0; i < queries.size(); i++) {
      String start = queries.get(i).get(0);
      String end = queries.get(i).get(1);
      if (!graph.containsKey(start) || !graph.containsKey(end)) {
        results[i] = -1.0;
      } else {
        results[i] = dfs(graph, start, end, new HashSet<>(), 1.0);
      }
    }
    return results;
  }

  private double dfs(
      Map<String, Map<String, Double>> graph,
      String current,
      String target,
      Set<String> visited,
      double product) {
    // Base case: If current equals target, return the product
    if (current.equals(target)) {
      return product;
    }
    visited.add(current);

    // Explore neighbors
    for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
      if (!visited.contains(neighbor.getKey())) {
        double result =
            dfs(graph, neighbor.getKey(), target, visited, product * neighbor.getValue());
        if (result != -1.0) {
          return result;
        }
      }
    }

    return -1.0;
  }
}
