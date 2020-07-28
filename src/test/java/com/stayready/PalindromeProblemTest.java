package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeProblemTest {
    private PalindromeProblem palindromeProblem;

    @Before
    public void setup() {
        palindromeProblem = new PalindromeProblem();
    }

    @Test
    public void isStringPalindrome() {
        String input = "racecar";

        boolean answer = palindromeProblem.isStringPalindrome(input);

        Assert.assertTrue(answer);
    }
}
