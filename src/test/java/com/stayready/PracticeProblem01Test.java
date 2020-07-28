package com.stayready;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test 
{
    @Test
    public void contructorTest()
    {
        PracticeProblem01 pb = new PracticeProblem01();
        Assert.assertNotNull(pb);
    }

    @Test
    public void isPalinTestTrue()
    {
        PracticeProblem01 pb = new PracticeProblem01();
       boolean actual = pb.isPalin("apa");

       assertTrue(actual);
    }

    @Test
    public void isPalinTestFalse()
    {
        PracticeProblem01 pb = new PracticeProblem01();
       boolean actual = pb.isPalin("apla");

       assertFalse(actual);
    }

    @Test
    public void getPalinPossiblesTest()
    {
        PracticeProblem01 pb = new PracticeProblem01();

        pb.checkPalinPossible("rotator");
        assertTrue("It is contained", pb.getStoredPossibles().contains("tat"));
        assertTrue("It is contained", pb.getStoredPossibles().contains("a"));
        assertTrue("It is contained", pb.getStoredPossibles().contains("otato"));
    }
}
