package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationOfStringTest {

  @Test
  void getPermutationsOfHa() {
    List<String> expected = List.of("ah", "ha");
    String input = "ha";
    ArrayList<String> permutations = PermutationOfString.getPermutations(input);
    Assertions.assertIterableEquals(expected, permutations);
  }

  @Test
  void getPermutationsOfHad() {
    List<String> output = List.of("dah", "adh", "ahd", "dha", "hda", "had");
    String input = "had";
    ArrayList<String> permutations = PermutationOfString.getPermutations(input);
    Assertions.assertIterableEquals(output, permutations);
  }
}
