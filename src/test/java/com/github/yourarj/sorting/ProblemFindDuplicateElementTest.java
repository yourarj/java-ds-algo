package com.github.yourarj.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProblemFindDuplicateElementTest {
  private final ProblemFindDuplicateElement target = new ProblemFindDuplicateElement();

  @Test
  void findDuplicateCase01() {
    int[] nums = {1, 3, 4, 2, 2};
    int output = 2;
    Assertions.assertEquals(output, target.findDuplicate(nums));
  }

  @Test
  void findDuplicateCase02() {
    int[] nums = {3, 1, 3, 4, 2};
    int output = 3;
    Assertions.assertEquals(output, target.findDuplicate(nums));
  }
}
