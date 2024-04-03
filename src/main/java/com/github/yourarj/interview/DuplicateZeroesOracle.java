package com.github.yourarj.interview;

public class DuplicateZeroesOracle {
  public void duplicateZeroes(int[] a) {
    if (a == null) return;

    int numberOfZeroes = 0;
    for (int num : a) {
      if (num == 0) numberOfZeroes++;
    }

    for (int i = a.length - 1; i >= 0; i--) {
      checkAndAssign(a, i, numberOfZeroes);
      if (a[i] == 0) {
        numberOfZeroes--;
        checkAndAssign(a, i, numberOfZeroes);
      }
    }
  }

  private void checkAndAssign(int[] a, int index, int numberOfZeroes) {
    int targetIndex = index + numberOfZeroes;
    if (targetIndex <= a.length - 1) {
      a[targetIndex] = a[index];
    }
  }
}
