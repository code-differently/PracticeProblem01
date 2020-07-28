package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    @Test
    public void isPalindromeTest(){
        PracticeProblem01 isPalindromeTest = new PracticeProblem01();

        boolean expected = isPalindromeTest.isPalindrome("LOOOL");
        boolean actual = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSubPalindromicTest(){
        PracticeProblem01 palindromesTest = new PracticeProblem01();
        
        String expected  = "r a c e c a r";
        String actual = PracticeProblem01.getSubPalindroms();

        Assert.assertEquals(expected, actual);
    }
}
