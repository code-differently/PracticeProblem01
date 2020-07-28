package com.stayready;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PracticeProblem01Test {
    @Test
    public void isAPalTest(){
        //Given
        PracticeProblem01 prac = new PracticeProblem01();
        String palProspect = "sosasos";
        //When
        boolean actual = prac.isAPal(palProspect);
        boolean expected = true;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void partitionOneTest(){
        //Given
        PracticeProblem01 prac = new PracticeProblem01();
        String palindrome = "racecar";
        //When
        String actual = prac.partitionOne(palindrome);
        String expected = "r a c e c a r";
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void partiotionGenTest(){
        //Given
        PracticeProblem01 prac = new PracticeProblem01();
        String palindrome = "racecar";
        //When
        ArrayList sosa = new ArrayList();
        String[] arr = {"r a cec a r","r aceca r","r a c e c a r"};
        for(String s : arr){
            sosa.add(s);
        }
        ArrayList actual = prac.partitionGen(palindrome);
        ArrayList expected = sosa;
        //Then
        Assert.assertEquals(expected, actual);
    }
}
