package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SubsetOfCharactersTest {
  private final SubsetOfCharacters target = new SubsetOfCharacters();

  @Test
  void subsets01HappyPath() {
    String input = "aw";
    List<String> subsets = target.subsets(input);
    List<String> expected = List.of("aw", "a", "w", "");
    assertIterableEquals(expected, subsets);
  }

  @Test
  void subsets01HappyPathAbc() {
    String input = "abc";
    List<String> subsets = target.subsets(input);
    List<String> expected = List.of("abc", "ab", "ac", "a", "bc", "b", "c", "");
    assertIterableEquals(expected, subsets);
  }
}
