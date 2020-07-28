package com.stayready;

import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeProblem01Test {
    PracticeProblem01 obj = new PracticeProblem01();

    @Test
    public void isPalindromeTest() {
        String testCase = "madam";

        assertTrue(obj.isPalindrome(testCase));
    }

    @Test
    public void isPalindromeTest2() {
        String testCase = "truck";

        assertFalse(obj.isPalindrome(testCase));
    }

    @Test
    public void palindromePartitionsTest() {
        String testCase = "racecar";

        String expected = "r a c e c a r\nr aceca r\nr a cec a r";

        assertEquals(expected, obj.palindromicPartitions(testCase));
    }
}
