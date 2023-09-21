package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {
  private final Fibonacci target = new Fibonacci();

  @Test
  void fibonacciCase01() {
    Assertions.assertEquals(0, target.fibonacci(0));
  }

  @Test
  void fibonacciCase02() {
    Assertions.assertEquals(1, target.fibonacci(1));
  }

  @Test
  void fibonacciCase03() {
    Assertions.assertEquals(1, target.fibonacci(1));
  }

  @Test
  void fibonacciCase04() {
    Assertions.assertEquals(2, target.fibonacci(3));
  }

  @Test
  void fibonacciCase05() {
    Assertions.assertEquals(21, target.fibonacci(8));
  }
}
