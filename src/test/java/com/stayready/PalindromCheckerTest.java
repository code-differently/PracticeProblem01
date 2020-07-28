package com.stayready;

import org.junit.Assert;
import org.junit.Test;

public class PalindromCheckerTest {

    @Test
    public void isPalindromTest(){
        // Given
        String test="racecar";

        // When
        boolean actual=PalindromChecker.isPalidrone(test);

        // Then
        Assert.assertTrue(actual);

    }

    @Test
    public void isPalindromTest2(){
        // Given
        String test="aceca";

        // When
        boolean actual=PalindromChecker.isPalidrone(test);

        // Then
        Assert.assertTrue(actual);

    }

    @Test
    public void isPalindromTest3(){
        // Given
        String test="abcdefgfedcba";

        // When
        boolean actual=PalindromChecker.isPalidrone(test);

        // Then
        Assert.assertTrue(actual);

    }

    @Test
    public void isPalindromTest4(){
        // Given
        String test=")*ab1de@g@ed1ba*)";

        // When
        boolean actual=PalindromChecker.isPalidrone(test);

        // Then
        Assert.assertTrue(actual);

    }
    @Test

    public void palindromPartitionTest(){
        // Given
        String test="racecar";
        String expected="r a c e c a r\n" +
            "r aceca r\n" +
            "r a cec a r";

        // When
        String actual=PalindromChecker.palindromPartitions(test);

        // Then
        Assert.assertEquals(expected,actual);

    }

}
