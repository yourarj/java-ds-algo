package com.github.yourarj.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllOccurrences {
  public List<Integer> findAll(int[] arr, int needle, int index) {
    if (arr.length - 1 < index) {
      return new ArrayList<Integer>();
    }
    List<Integer> list = findAll(arr, needle, index + 1);
    if (arr[index] == needle) list.add(index);

    return list;
  }
}
