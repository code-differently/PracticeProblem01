package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PracticeProblem01Test {
    PracticeProblem01 problem;
    private static final String input01 = "racecar";

    @Before
    public void initalize() {
        problem = new PracticeProblem01();
    }

    @Test
    public void palindromTest() {
        String expected = "r a c e c a r";
        String actual = problem.Palindrome(input01);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindrom() {
        boolean actual= problem.isPalindrome(input01);
        Assert.assertEquals(expected, actual);
    }
}
