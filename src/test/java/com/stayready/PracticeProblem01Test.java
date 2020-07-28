package com.stayready;
import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test 
{
    @Test
    public void isPalindromeTest()
    {
        //Given 
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String input = "racecar";
        //When 
        Boolean actual = practiceProblem01.isPalindrome(input);
        Boolean expected = true;
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void substringTest()
    {
        //Given 
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String input = "abbc";
        //When
        String actual = practiceProblem01.subStrings(input);
        String expected = "a\nab\nabb\nabbc\nb\nbb\nbbc\nb\nbc\nc";
        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void palindromePartitionsTest()
    {
        //Given 
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String input = "racecar";
        //When
        String actual = practiceProblem01.palindromePartitions(input);
        String expected = "r a c e c a r\nr aceca r\nr a cec a r\n";
        //Then
        Assert.assertEquals(expected, actual);
    }

}
