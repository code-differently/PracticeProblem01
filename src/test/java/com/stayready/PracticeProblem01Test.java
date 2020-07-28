package com.stayready;

import org.junit.Assert;
import org.junit.Test;


public class PracticeProblem01Test {
    private static final String input01 = "racecar";

    @Test
    public void getSubPalindronesTest01(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a c e c a r";
        String actual = practiceProblem01.getSubPalindrones(input01);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSubPalindronesTest02(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r aceca r";
        String actual = practiceProblem01.getSubPalindrones(input01);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getSubPalindronesTest03(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a cec a r";
        String actual = practiceProblem01.getSubPalindrones(input01);
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void isPalinedrineTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        Boolean actual = practiceProblem01.isPalindrones("aba");
        Assert.assertTrue(actual);
    }

}
