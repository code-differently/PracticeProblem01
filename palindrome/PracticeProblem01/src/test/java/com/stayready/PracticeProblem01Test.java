package com.stayready;
import org.junit.Test;
import org.junit.Assert;

public class PracticeProblem01Test {

    private static final String input = "racecar";
    @Test
    public void palindrome1Test(){
       
        practiceProblem01 practiceProblem01 = new practiceProblem01();
        String expected = "r a c e c a r";
        String actual = PracticeProblem01.palindrome1(input);
        Assert.assertEquals(expected, actual);
    }

//unfinished tests... have an idea???
    // @Test
    // public void palindrome2Test(){
       
    //     practiceProblem01 practiceProblem01 = new practiceProblem01();
    //     String expected = "r aceca r";
    //     String actual = PracticeProblem01.palindrome1(input);
    //     Assert.assertEquals(expected, actual);
    // }


    // @Test
    // public void palindrome3Test(){
       
    //     practiceProblem01 practiceProblem01 = new practiceProblem01();
    //     String expected = "r a cec a r";
    //     String actual = PracticeProblem01.palindrome1(input);
    //     Assert.assertEquals(expected, actual);
    // }

    }

