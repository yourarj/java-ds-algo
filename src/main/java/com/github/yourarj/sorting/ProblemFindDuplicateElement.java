package com.github.yourarj.sorting;

public class ProblemFindDuplicateElement {
  public int findDuplicate(int[] numbers) {
    for (int i = 0; i < numbers.length; ) {
      int expectedNum = i + 1;
      if (numbers[i] != expectedNum) {
        if (numbers[numbers[i] - 1] == numbers[i]) {
          return numbers[i];
        }

        int temp = numbers[numbers[i] - 1];
        numbers[numbers[i] - 1] = numbers[i];
        numbers[i] = temp;
      } else {
        i++;
      }
    }
    throw new IllegalStateException("No duplicate element found!");
  }
}
