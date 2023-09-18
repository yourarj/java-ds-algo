package com.github.yourarj.sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProblemFindAllDuplicatesInArray {
  public List<Integer> findDuplicates(int[] numbers) {
    final Set<Integer> result = new HashSet<>();
    for (int i = 0; i < numbers.length; ) {
      int expectedNumber = i + 1;
      int actualNumber = numbers[i];
      if (actualNumber != expectedNumber) {
        if (numbers[actualNumber - 1] == actualNumber) {
          result.add(actualNumber);
          i++;
        } else {
          numbers[i] = numbers[actualNumber - 1];
          numbers[actualNumber - 1] = actualNumber;
        }
      } else {
        i++;
      }
    }
    return new ArrayList<>(result);
  }
}
