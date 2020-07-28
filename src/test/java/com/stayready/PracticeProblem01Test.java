package com.stayready;
import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {

    public Object PracticeProblem01;

    @Test
    public void PracticeProblem01Test(){
        //Given
        String expected = "racecar";
        //When
        String actual = (String) PracticeProblem01;
        //Then
        Assert.assertEquals(expected,actual);
    }
}
