package com.github.yourarj.utils;

import java.util.Arrays;

public class Utils {
  /**
   * 2D Array to String
   *
   * @param array 2D array
   * @return String representation
   */
  public static String TwoDArrayToString(int[][] array) {
    final StringBuilder builder = new StringBuilder();
    for (int[] arr : array) {
      builder.append(Arrays.toString(arr));
      builder.append(System.lineSeparator());
    }
    return builder.toString();
  }
}
