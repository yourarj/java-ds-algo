package com.github.yourarj.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class LetterCombinationOfPhoneNumberTest {

  @Test
  void letterCombinations_case01() {

    String digits = "23";
    List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case02() {
    String digits = "";
    List<String> expected = List.of();
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case03() {
    String digits = "2";
    List<String> expected = List.of("a", "b", "c");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case04() {
    String digits = "89";
    List<String> expected =
        List.of("tw", "tx", "ty", "tz", "uw", "ux", "uy", "uz", "vw", "vx", "vy", "vz");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    System.out.printf("Expected: %s\n", expected);
    System.out.printf("Actual: %s\n", output);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case05() {
    String digits = "9";
    List<String> expected = List.of("w", "x", "y", "z");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case06() {
    String digits = "3";
    List<String> expected = List.of("d", "e", "f");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case07() {
    String digits = "4";
    List<String> expected = List.of("g", "h", "i");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case08() {
    String digits = "5";
    List<String> expected = List.of("j", "k", "l");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case09() {
    String digits = "6";
    List<String> expected = List.of("m", "n", "o");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case10() {
    String digits = "7";
    List<String> expected = List.of("p", "q", "r", "s");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }

  @Test
  void letterCombinations_case11() {
    String digits = "8";
    List<String> expected = List.of("t", "u", "v");
    List<String> output = LetterCombinationOfPhoneNumber.letterCombinations(digits);
    assertIterableEquals(expected, output);
  }
}
