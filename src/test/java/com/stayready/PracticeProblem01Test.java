package com.stayready;

import org.junit.Assert;
import org.junit.Test;
public class PracticeProblem01Test {;
    private static final String input01 = "racecar";

    @Test

    public void getSubPalindromeTest(){
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        //When
        String expected = "r a c e c a r";
        String actual = practiceProblem01.getSubPalindromes(input01);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromTestTrue(){
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        //When
        Boolean actual = practiceProblem01.isPalindrome("aba");
        //Then
        Assert.assertTrue(actual);

    }
}
