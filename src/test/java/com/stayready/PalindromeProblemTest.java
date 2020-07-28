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
        String expectedAnswer = "a ";

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions(stringTwo);

        assertEquals(expectedAnswer, actualAnswer);
    }

//    @Test
//    public void findTwoPartitionsTest() {
//        String expectedAnswer = "r a c e c a r\n r aceca r";
//
//        String actualAnswer = palindromeProblem.findAllPalindromicPartitions(stringOne);
//    }

    @Test
    public void isStringEvenYesTest() {
        String input = "hide";

        boolean actualAnswer = palindromeProblem.isStringEvenLength(input);

        assertTrue(actualAnswer);
    }

    @Test
    public void isStringEvenNoTest() {
        String input = "hid";

        boolean actualAnswer = palindromeProblem.isStringEvenLength(input);

        assertFalse(actualAnswer);
    }
}
