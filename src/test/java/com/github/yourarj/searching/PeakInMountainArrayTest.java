package com.github.yourarj.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PeakInMountainArrayTest {
  private final PeakInMountainArray target = new PeakInMountainArray();

  @Test
  void findPeak() {
    int[] inputArray = {0,1,0};
    int expectedOutput = 1;
    int actualOutput = target.findPeak(inputArray);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void findPeakLonger() {
    int[] inputArray = {0,1,2,3,4,5,6,7,8,0};
    int expectedOutput = 8;
    int actualOutput = target.findPeak(inputArray);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }
}
