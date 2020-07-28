package com.stayready;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeProblemTest {
    private PalindromeProblem palindromeProblem;
    private final String stringOne = "racecar";
    private final String stringTwo = "a";
    private final String stringThree = "abcba";

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

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions(stringTwo);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void findTwoPartitionsStringTest() {
        String expectedAnswer = "a b c b a\na bcb a";

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions(stringThree);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void findThreePartitionsStringTest() {
        String expectedAnswer = "r a c e c a r\nr aceca r\nr a cec a r";

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions(stringOne);

        assertEquals(expectedAnswer, actualAnswer);
    }
}
