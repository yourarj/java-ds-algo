package com.github.yourarj.leetcode_top_interview_150.prob_133_clone_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Definition for a Node.
class Node {
  public int val;
  public List<Node> neighbors;

  public Node() {
    val = 0;
    neighbors = new ArrayList<>();
  }

  public Node(int _val) {
    val = _val;
    neighbors = new ArrayList<Node>();
  }

  public Node(int _val, ArrayList<Node> _neighbors) {
    val = _val;
    neighbors = _neighbors;
  }
}

class Solution {
  final Map<Integer, Node> map = new HashMap<>();

  public Node cloneGraph(Node node) {
    if (null == node) return null;

    Node clonedNode = map.get(node.val);
    if (null == clonedNode) {
      clonedNode = new Node(node.val);
      map.put(node.val, clonedNode);
      for (Node n : node.neighbors) {
        clonedNode.neighbors.add(cloneGraph(n));
      }
    }
    return clonedNode;
  }
}
