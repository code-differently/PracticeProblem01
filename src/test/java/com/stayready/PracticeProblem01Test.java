package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PracticeProblem01Test {

    PracticeProblem01 solution;

    @Before
    public void setup(){
        solution = new PracticeProblem01();
    }


    @Test
    public void isPalindromeTestTrue(){
        //Given
        String input = "racecar";
        String expected = "True";

        //When
        String actual = solution.isPalindrome(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTestFalse(){
        //Given
        String input = "race";
        String expected = "False";

        //When
        String actual = solution.isPalindrome(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstOutputPalindromeTest(){
        //Given
        String input = "racecar";
        String expected = "r a c e c a r ";

        //When
        String actual = solution.firstOutputPalindrome(input);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void secondOutputPalindromeTest(){
        //Given
        String input = "racecar";
        String expected = "r aceca r";

        //When
        String actual = solution.secondOutputPalindrome(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void thirdOutputPalindromeTest(){
        //Given
        String input = "racecar";
        String expected = "r a cec a r";

        //When
        String actual = solution.thirdOutputPalindrome(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

}
