package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    @Test
    public void PartitionPalindromeTest(){
    //Check if string is a palindrome
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String input = "n u r s e s r u n";
        boolean expected = true;

        //When
        boolean actual = practiceProblem01.partitionPalindrome(input);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void PartitionPalindromeTest2(){
    //test for the return of all possible palindromes in string
        //Given
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String input = "";
        
    }
    
    
}
