package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PracticeProblem01Test {

    String expected;
    String actual;
    PracticeProblem01 test;


    @Before
    public void setUp() {

        expected = "";
        actual = "";
        test = new PracticeProblem01();
        test.setPali("racecar");
    }

    @Test
    public void setletterCountTest() {

        expected = "{a=2, r=2, c=2, e=1}";

        test.setLetterCount();
        actual = test.getLetterCount().toString();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findCenterTest() {

        expected = "e";

        test.setLetterCount();
        test.findCenter();
        actual = test.getCenter();

        Assert.assertEquals(expected, actual);

    }


}
