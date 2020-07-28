package com.stayready;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test 
{
    @Test
    public void constructorTest()
    {
        PracticeProblem01 palin = new PracticeProblem01();

        Assert.assertNotNull(palin);
    }

    @Test 
    public void isPalindroneTest()
    {
        //Given
        PracticeProblem01 palin = new PracticeProblem01();

        //Then
        boolean actual = palin.isPalindrone();

        //When
        assertTrue(actual);
    }
}
