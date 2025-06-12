package com.github.yourarj.gfg_amzn_sde_dsa.string.permutation_of_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

  @Test
  void getPermutations_Test_01() {
    final String input = "ABC";
    final List<String> expected = List.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");
    final List<String> actual = Solution.getPermutations(input);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void getPermutations_Test_02() {
    final String input = "XY";
    final List<String> expected = List.of("XY", "YX");
    final List<String> actual = Solution.getPermutations(input);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void getPermutations_Test_03() {
    final String input = "AAA";
    final List<String> expected = List.of("AAA", "AAA", "AAA", "AAA", "AAA", "AAA");
    final List<String> actual = Solution.getPermutations(input);
    Assertions.assertIterableEquals(expected, actual);
  }

  @Test
  void getPermutations_Test_04() {
    final String input = "ABCD";
    final List<String> expected = List.of(
      "ABCD", "ABDC", "ACBD", "ACDB", "ADBC", "ADCB",
      "BACD", "BADC", "BCAD", "BCDA", "BDAC", "BDCA",
      "CABD", "CADB", "CBAD", "CBDA", "CDAB", "CDBA",
      "DABC", "DACB", "DBAC", "DBCA", "DCAB", "DCBA");
    final List<String> actual = Solution.getPermutations(input);
    Assertions.assertIterableEquals(expected, actual);
  }

}
