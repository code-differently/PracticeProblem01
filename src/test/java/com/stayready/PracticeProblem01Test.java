package com.stayready;
import org.junit.Test;
import org.junit.Assert;

public class PracticeProblem01Test{


    @Test
    public void isPalindromTest(){
        String input01 = "r a c e c a r";
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        Boolean actual = practiceProblem01.isPalindrome(input01);
        Assert.assertTrue(actual);
    }
    @Test
    public void checkforLettersTest(){
        String input01 = "r a c e c a r";
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String actual  = practiceProblem01.checkLetters(input01);
        String expected = "r a c e c a r\n" +
                "r aceca r\n" +
                "r a cec a r";
        Assert.assertEquals(expected,actual);
    }







}