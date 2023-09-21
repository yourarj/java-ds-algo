package com.github.yourarj.interview;

import java.util.*;

public class LinkedListIntersection {
  public static class SinglyLinkedList {
    public String value;
    public SinglyLinkedList next;

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SinglyLinkedList that = (SinglyLinkedList) o;
      return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
      return Objects.hash(value);
    }

    @Override
    public String toString() {
      String nxtToString = next == null ? null : next.value;
      return "SinglyLinkedList{" + "value='" + value + '\'' + ", next=" + nxtToString + '}';
    }

    public SinglyLinkedList(String value, SinglyLinkedList next) {
      this.value = value;
      this.next = next;
    }
  }

  private final Map<String, SinglyLinkedList> state = new HashMap<>();

  /**
   * Add node connection to state
   *
   * @param input new connection between nodes
   */
  public void addNodeConnection(String input) {
    String[] strings = input.split("->");
    String from = strings[0].trim();
    String to = strings[1].trim();

    SinglyLinkedList toNode = state.get(to);
    SinglyLinkedList fromNode = state.get(from);

    if (toNode == null) {
      toNode = new SinglyLinkedList(to, null);
    }
    if (fromNode == null) {
      fromNode = new SinglyLinkedList(from, toNode);
    } else {
      fromNode.next = toNode;
    }
    state.put(from, fromNode);
    state.put(to, toNode);
  }

  public Collection<SinglyLinkedList> parseLinkedLists(String input) {
    List<SinglyLinkedList> list = new ArrayList<>();
    for (String str : input.split(",")) {
      str = str.trim();
      str = str.trim();
      list.add(state.get(str.trim()));
    }
    return list;
  }

  void initializeState() {}

  boolean doLinkedListsIntersect(Collection<SinglyLinkedList> lists) {
    Set<SinglyLinkedList> visited = new HashSet<>();

    for (SinglyLinkedList sl : lists) {
      for (SinglyLinkedList tortoise = sl, heir = sl; tortoise != null; ) {
        if (!visited.add(tortoise)) {
          return true;
        }

        tortoise = tortoise.next;

        if (heir.next != null && heir.next.next != null) {

          heir = heir.next.next;

          if (tortoise.equals(heir)) {
            throw new IllegalArgumentException("Error thrown");
          }
        }
      }
    }
    return false;
  }
}
