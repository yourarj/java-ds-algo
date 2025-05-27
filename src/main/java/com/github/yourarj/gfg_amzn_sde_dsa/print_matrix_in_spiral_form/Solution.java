package com.github.yourarj.gfg_amzn_sde_dsa.print_matrix_in_spiral_form;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static List<Integer> spirallyTraverse(int[][] m) {
    if (null == m || m.length < 1) return List.of();

    // define i & j
    int i = 0, j = 0, top = -1, left = -1, right = m[0].length, bottom = m.length;

    final List<Integer> list = new ArrayList<>();

    while (left < right || top < bottom) {
      // iterate top
      if (j >= right) break;
      for (; j < right; j++) {
        list.add(m[i][j]);
      }
      j--;
      i++;
      top++;

      // iterate right
      if (i >= bottom) break;
      for (; i < bottom; i++) {
        list.add(m[i][j]);
      }
      j--;
      i--;
      right--;

      // iterate bottom
      if (j <= left) break;
      for (; j > left; j--) {
        list.add(m[i][j]);
      }
      j++;
      i--;
      bottom--;

      // iterate left
      if (i <= top) break;
      for (; i > top; i--) {
        list.add(m[i][j]);
      }
      i++;
      j++;
      left++;
    }
    return list;
  }
}
