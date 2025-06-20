package com.github.yourarj.gfg_amzn_sde_dsa.sorting.kth_element_merged_arrays;

public class Solution {
  public static int kthElement(final int[] a, final int[] b, final int k) {
    final int sal = a.length, lal = b.length;

    if (k > sal + lal) return -1;

    if (sal > lal) return kthElement(b, a, k);

    int low = 0, hi = sal;
    int sam, lam, lsa, rsa, lla, rla;

    while (low <= hi) {
      sam = low + (hi - low) / 2;
      lam = k - sam;

      lsa = sam == 0 ? Integer.MIN_VALUE : a[sam - 1];
      rsa = sam >= sal - 1 ? Integer.MAX_VALUE : a[sam];

      lla = lam == 0 ? Integer.MIN_VALUE : b[lam - 1];
      rla = lam >= lal - 1 ? Integer.MAX_VALUE : b[lam];

      if (lsa <= rla && lla <= rsa) {
        return Math.max(lsa, lla);
      }

      if (lsa > rla) {
        hi = sam - 1;
      } else {
        low = sam + 1;
      }
    }
    return 0;
  }
}
