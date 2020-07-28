package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeProblemTest {
    private PalindromeProblem palindromeProblem;
    private final String inputtedString = "racecar";

    @Before
    public void setup() {
        palindromeProblem = new PalindromeProblem();
    }

    @Test
    public void isStringPalindromeTest() {
        boolean answer = palindromeProblem.isStringPalindrome(inputtedString);

        Assert.assertTrue(answer);
    }

    @Test
    public void returnIndividualCharacterPalindromeTest() {
        String expectedAnswer = "r a c e c a r ";

        String actualAnswer = palindromeProblem.findAllPalindromicPartitions(inputtedString);

        Assert.assertEquals(expectedAnswer, actualAnswer);
    }
}
