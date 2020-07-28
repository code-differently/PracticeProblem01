package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    @Test
    public void isPalindromeTestTrue(){
        PracticeProblem01 p01 = new PracticeProblem01();

        boolean actual = p01.isPalindrome("aba");

        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindromeTestFalse(){
        PracticeProblem01 p01 = new PracticeProblem01();

        boolean actual = p01.isPalindrome("abc");

        Assert.assertFalse(actual);
    }

    @Test
    public void getSubstringTest(){
        PracticeProblem01 p01 = new PracticeProblem01();

        String actual = p01.getSubstring("raceca");
        String expected = "aceca";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSubPalindromeTest(){
        PracticeProblem01 p01 = new PracticeProblem01();

        String actual = p01.getSubPalindrome("racecar");
        String expected = "r a c e c a r";

        Assert.assertEquals(expected, actual);
    }
}
