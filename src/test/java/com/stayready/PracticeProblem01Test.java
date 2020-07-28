package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {
    //public static final String word = "racecar";

    @Test
    public void isPalindromeTest(){
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "racecar";

        //When
        boolean actual = practiceProblem01.isPalindrome(expected);

        //Then
        Assert.assertTrue(expected, actual);

    }

    @Test
    public void palindromicPartitions01(){
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a c e c a r";

        //When
        String actual = practiceProblem01.palindromicPartitions(expected);

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void palindromicPartitions02(){
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r aceca r";

        //When
        String actual = practiceProblem01.palindromicPartitions(expected);

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void palindromicPartitions03(){
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a cec a r";

        //When
        String actual = practiceProblem01.palindromicPartitions(expected);

        //Then
        Assert.assertEquals(expected,actual);


    }
}
