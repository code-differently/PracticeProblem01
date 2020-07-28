package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PracticeProblem01Test {

    PracticeProblem01 aPracticeProblem;
    @Before
    public void setup(){
        this.aPracticeProblem = new PracticeProblem01();
    }

    @Test
    public void isPalindromTest(){
        // Given
        Boolean expected = true;

        // When
        Boolean actual = aPracticeProblem.isPalindrom("racecar");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromTest2(){
        // Given
        Boolean expected = true;

        // When
        Boolean actual = aPracticeProblem.isPalindrom("dad");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromTest3(){
        // Given
        Boolean expected = false;

        // When
        Boolean actual = aPracticeProblem.isPalindrom("hope");

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkIfPalindromTest(){
        // Given
        Boolean expected = true;

        // When
        Boolean actual = aPracticeProblem.checkIfPalindrom("dad");

        // Then
        Assert.assertEquals(expected, actual);
    }
}
