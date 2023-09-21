package com.github.yourarj.recursion;

/** Fibonacci Sequence with Recursion */
public class Fibonacci {
  /**
   * Get nth term in fibonacci sequence
   *
   * @param n sequence in term
   * @return the term
   */
  public int fibonacci(int n) {

    if (n < 2) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
