package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    private final String input1 = "racecar";

    @Test
    public void isPalindromeTestTrue(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        Boolean actual = practiceProblem01.isPalindrome(input1);
        Assert.assertTrue(actual);
    }

    @Test
    public void turnToCharsTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a c e c a r";
        String actual = practiceProblem01.turnToChars(input1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void firstPalindromeTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r aceca r";
        String actual = practiceProblem01.firstPalindrome(input1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondPalindromeTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a cec a r";
        String actual = practiceProblem01.secondPalindrome(input1);
        Assert.assertEquals(expected,actual);
    }
}
