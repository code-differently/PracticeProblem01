package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    public static final String input01 = "racecar";
    public static final String input02 = "race";

    @Test
    public void findPalindromicSubstringsTest() {
        // Given
        PracticeProblem01 pp1 = new PracticeProblem01();
        String expected = "r\n" +
                        "racecar\n" +
                        "a\n" +
                        "aceca\n" +
                        "c\n" +
                        "cec\n" +
                        "e\n" +
                        "c\n" +
                        "a\n" +
                        "r";

        // When
        String actual = pp1.findPalindromicSubstrings(input01);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findAllPalindromicPartitionsTest() {
        // Given
        PracticeProblem01 pp1 = new PracticeProblem01();
        String expected = "r a c e c a r\n" +
                            "r aceca r\n" +
                            "r a cec a r";

        // When
        String actual = pp1.findAllPalindromicPartitions(input01);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTestTrue() {
        // Given
        PracticeProblem01 pp1 = new PracticeProblem01();

        // When
        boolean actual = pp1.isPalindrome(input01);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void isPalindromeTestFalse() {
        // Given
        PracticeProblem01 pp1 = new PracticeProblem01();

        // When
        boolean actual = pp1.isPalindrome(input02);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void getSinglePartitionsTest() {
        // Given
        PracticeProblem01 pp1 = new PracticeProblem01();
        String expected = "r a c e c a r";

        // When
        String actual = pp1.getSinglePartitions(input01);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
