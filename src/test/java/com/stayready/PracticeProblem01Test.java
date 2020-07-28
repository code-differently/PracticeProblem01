package com.stayready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PracticeProblem01Test {

    PracticeProblem01 p;
    String s;
    @Before
    public void initialize(){
        p = new PracticeProblem01();
        s = "racecar";
    }
    @Test
    public void isPalindromeTest(){
        Assert.assertEquals(true, p.isPalindrome(s));
    }
    @Test
    public void isPalindromeTest2(){
        Assert.assertEquals(false, p.isPalindrome("abc"));
    }
    @Test
    public void isPalindromeTest3(){
        Assert.assertEquals(true, p.isPalindrome("a"));
    }
    @Test
    public void isPalindromeTest4(){
        Assert.assertEquals(true, p.isPalindrome("aba"));
    }
    @Test
    public void getPartitionsTest(){
        Assert.assertEquals("r a c e c a r", p.getPartitions(s));
    }
    @Test
    public void getPartitionsTest2(){
        Assert.assertEquals(null, p.getPartitions("abc"));
    }
    @Test
    public void getPartitionsTest3(){
        Assert.assertEquals("a", p.getPartitions("a"));
    }
    @Test
    public void getPartitionsTest4(){
        Assert.assertEquals("a b a", p.getPartitions("aba"));
    }

    @Test
    public void getFirstPartitionsTest(){
        Assert.assertEquals("r aceca r", p.getFirstPartitions(s));
    }
    @Test
    public void getFirstPartitionsTest2(){
        Assert.assertEquals(null, p.getFirstPartitions("abc"));
    }
    @Test
    public void getFirstPartitionsTest3(){
        Assert.assertEquals("a", p.getFirstPartitions("a"));
    }
    @Test
    public void getFirstPartitionsTest4(){
        Assert.assertEquals("a b a", p.getFirstPartitions("aba"));
    }

    @Test
    public void getSecondPartitionsTest(){
        Assert.assertEquals("r a cec a r", p.getSecondPartitions(s));
    }
    @Test
    public void getSecondPartitionsTest2(){
        Assert.assertEquals(null, p.getSecondPartitions("abc"));
    }
    @Test
    public void getSecondPartitionsTest3(){
        Assert.assertEquals("a", p.getSecondPartitions("a"));
    }
    @Test
    public void getSecondPartitionsTest4(){
        Assert.assertEquals("a b a", p.getSecondPartitions("aba"));
    }
}
