package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {
    private static final String input01 = "racecar";

    @Test
    public void getSubPalindromsTest(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "racecar";
        Boolean actual = practiceProblem01.getSubPalindroms(input01);
        Assert.assertTrue(expected,actual);
    }

    @Test
    public void getSubPalindroms1Test(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a c e c a r";
        Boolean actual = practiceProblem01.getSubPalindroms1(input01);
        Assert.assertTrue(expected,actual);
    }
    @Test
    public void getSubPalindroms2Test(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r aceca r";
        Boolean actual = practiceProblem01.getSubPalindroms2(input01);
        Assert.assertTrue(expected,actual);
    }
    @Test
    public void getSubPalindroms3Test(){
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String expected = "r a cec a r";
        Boolean actual = practiceProblem01.getSubPalindroms3(input01);
        Assert.assertTrue(expected,actual);
    }
}
