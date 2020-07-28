package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test { // Haha I got my test this time Monsieur Baron Von Codem!!

    private static final String testInput1 = "racecar";
    private static final String testInput2 = "batman";

    @Test
    public void getPartitionsTest(){
        // Given
        String expected =   "r a c e c a r\n" +
                            "r aceca r\n" +
                            "r a cec a r";

        // When
        String actual = PracticeProblem01.getPartitions(testInput1);

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isPalindromeTest_T(){
        // Given

        // When
        Boolean actual = PracticeProblem01.isPalindrome(testInput1);

        // Then
        Assert.assertTrue(actual);

    }

    @Test
    public void isPalindromeTest_F() {
        // Given

        // When
        Boolean actual = PracticeProblem01.isPalindrome(testInput2);

        // Then
        Assert.assertFalse(actual);

    }


}
