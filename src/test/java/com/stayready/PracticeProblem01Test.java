package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {
    @Test
    public void isPalindromeTest(){
        //Given
        boolean expected = true;
        //When
        PracticeProblem01 palindrome = new PracticeProblem01();
        boolean actual = palindrome.isPalindrome("racecar");
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void palindromPartitionsTest(){
        //Given
        String expected =
                "r a c e c a r  " +
                "\nr aceca r" +
                "\nr a cec a r";

        //When
        PracticeProblem01 palindrome = new PracticeProblem01();
        String actual = palindrome.palindromePartitions("racecar");

        //Then
        Assert.assertEquals(expected, actual);
    }
}
