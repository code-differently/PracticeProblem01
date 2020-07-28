package com.stayready;

import org.junit.Before;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class PracticeProblem01Test {

    String input;
    PracticeProblem01 palindrome;

    @Before
    public void setup(){
        this.palindrome = new PracticeProblem01();
    }

    @Test
    public void isPalindromeTest(){
        input = "r";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void isPalindromeTest2(){
        input = "r a c e c a r";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void notPalindromeTest(){
        input = "race";
        assertFalse(palindrome.isPalindrome(input));
    }




}