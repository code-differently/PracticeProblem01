package com.stayready;

public class PracticeProblem01 {

    public Boolean isPolindrome(String text){
        StringBuilder output= new StringBuilder("text");
        StringBuilder reverseWord= output.reverse();
        return (output.equals(reverseWord))?true:false;

    }
    //Start partitioning from 1 letter to more checking if polindrome
    public String partition(String mainText){
        char[] letters= mainText.toCharArray();
//        while(isPolindrome()==true){
//
//        }
//
        return "";

    }
}
