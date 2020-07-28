package com.stayready;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeProblemTest {
    private PalindromeProblem palindromeProblem;
    private final String stringOne = "racecar";
    private final String stringTwo = "a";

    @Before
    public void setup() {
        palindromeProblem = new PalindromeProblem();
    }

    @Test
    public void isStringPalindromeTest() {
        boolean answer = palindromeProblem.isStringPalindrome(stringOne);

        assertTrue(answer);
    }

    @Test
    public void returnIndividualCharacterPalindromeTest() {
        String expectedAnswer = "a";

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions("a");

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void findPartitionsWithOddLengthStringTest() {
        String expectedAnswer = "a b c b a\na bcb a";

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions("abcba");

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void isStringEvenYesTest() {
        String input = "hide";
        int length = input.length();

        boolean actualAnswer = palindromeProblem.isStringEvenLength(length);

        assertTrue(actualAnswer);
    }

    @Test
    public void isStringOddTest() {
        String input = "hid";
        int length = input.length();

        boolean actualAnswer = palindromeProblem.isStringOddLength(length);

        assertTrue(actualAnswer);
    }
}
