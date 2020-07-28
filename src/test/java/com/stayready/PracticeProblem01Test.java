package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PracticeProblem01Test {
    PracticeProblem01 practice1;
    @Before
    public void setup(){
        this.practice1= new PracticeProblem01();
    }
    @Test
    public void isPolindrome(){
        Boolean expected= true;

        Boolean actual= practice1.isPolindrome("racecar");

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void partitionTest01(){
        String expected= String.format("r"+" "+"aceca"+" "+ "r");

        String actual= practice1.partition("racecar");

        Assert.assertEquals(expected,actual);

    }
}
