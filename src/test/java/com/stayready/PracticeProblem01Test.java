package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    @Test
    public void isPalimdromeTest(){
        // Given
        PracticeProblem01 p = new PracticeProblem01();
        String input = "racecar";
        // When
        Boolean actual = p.isPalindrome(input);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void makeItHappenTest(){
        // Given
        PracticeProblem01 p = new PracticeProblem01();
        String input = "racecar";
        String expected = "r a c e c a r";
        // When
        String actual = p.makeItHappen(input);
        // Then
        Assert.assertEquals(expected, actual);
    }
}
