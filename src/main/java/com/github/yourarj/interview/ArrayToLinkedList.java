package com.github.yourarj.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
  int value;
  Node left;
  Node right;

  public Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return value
        + "-> \n"
        + (left != null ? left.toString() : "END")
        + "->"
        + (right != null ? right.toString() : "END");
  }
}

public class ArrayToLinkedList {
  /*
             4
            /  \
           3    1
               /  \
              5     0
                     \
                      2
      [1,4,0,4,-1,1]

  */

  public static void main(String[] args) {
    int[] arr = {1, 4, 0, 4, -1, 1};
    constructTree(arr);
  }

  public static void constructTree(int[] arr) {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    int root = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        root = i;
      } else {
        graph.computeIfAbsent(arr[i], (k) -> new ArrayList<>(2)).add(i);
      }
    }
    System.out.println("graph:" + graph);
    Node rootNode = constructTree(graph, root);
    System.out.println("Root: " + rootNode);
  }

  static Node constructTree(Map<Integer, List<Integer>> map, int id) {
    List<Integer> list = map.get(id);
    System.out.println("map entry: " + id + " :" + list);
    if (list == null) return new Node(id, null, null);
    Node currentNode =
        new Node(
            id,
            list.isEmpty() ? null : constructTree(map, list.get(0)),
            list.size() < 2 ? null : constructTree(map, list.get(1)));

    return currentNode;
  }
}
