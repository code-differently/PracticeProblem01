package com.stayready;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class PracticeProblem01Test {

    @Test
    public void isPalindroneTest1(){
        //Given
        String word = "racecar";

        //Actual
        Assert.assertTrue(PracticeProblem01.isPalindrone(word));
    }

    @Test
    public void isPalindroneTest2(){
        //Given
        String word = "nascar";

        //Actual
        Assert.assertFalse(PracticeProblem01.isPalindrone(word));
    }
}
