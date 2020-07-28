package com.stayready;

import java.util.SplittableRandom;

public class PracticeProblem01 {

    public static Boolean isPalindrome(String input){
        String rvrsd = "";
        for(int idx = input.length() - 1; idx >= 0; idx--){
            rvrsd += input.charAt(idx);
        }

        if (input.equals(rvrsd)){
            return true;
        }
        return false;
    }

    public static String getPartitions(String input){
        return null;
    }

    public static void main(String[] args) {

    }
}
