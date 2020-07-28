package com.stayready;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class PracticeProblem01Test {

    public static PracticeProblem01 practice;


    @Test

    public void testPalindrom(){

        

        String text = "raCecAr";

        boolean actual = PracticeProblem01.isPalindrom(text);

        Assert.assertTrue(actual);

    }

    @Test

    public void testPartition(){

        String text = "NOT A PALINDROM";

        String expected = "Impossible! This is not a palindorm!";
        String actual = PracticeProblem01.partition(text);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testPartition2(){

        String text = "racecar";

        String expected = "r a c e c a r";
        String actual = PracticeProblem01.partition(text);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testAllPartitions(){

        String text = "NOT A PALINDROM";

        String expected = "Impossible! This is not a palindrom!";
        String actual = PracticeProblem01.allPartitions(text);

        Assert.assertEquals(expected, actual);
    }
}
