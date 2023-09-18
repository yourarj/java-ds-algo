package com.github.yourarj.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PeakInMountainArrayTest {

  @Test
  void findPeak() {
    int[] inputArray = {0,1,0};
    int expectedOutput = 1;
    PeakInMountainArray peakInMountainArray = new PeakInMountainArray();

    int actualOutput = peakInMountainArray.findPeak(inputArray);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }

  @Test
  void findPeakLonger() {
    int[] inputArray = {0,1,2,3,4,5,6,7,8,0};
    int expectedOutput = 8;
    PeakInMountainArray peakInMountainArray = new PeakInMountainArray();

    int actualOutput = peakInMountainArray.findPeak(inputArray);
    Assertions.assertEquals(expectedOutput, actualOutput);
  }
}
