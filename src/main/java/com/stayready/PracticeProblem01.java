package com.stayready;

import java.lang.*;

public class PracticeProblem01 {

    public String isPalindrome(String input){
            String string = "";
            String reverseString = new StringBuilder(input).reverse().toString();
            if (input.equals(reverseString)){
                string = "True";
            }else{
                string = "False";
            }
            return string;
        }


    public String firstOutputPalindrome(String input){
            String string = "racecar";
            String reverseString = new StringBuilder(input).reverse().toString();
            if (input.equals(reverseString)){
                string = string.replaceAll(".", "$0 ");
            }else{
                string = "False";
            }
        return string;
    }

    public String secondOutputPalindrome(String input){
        String string = "racecar";
        String reverseString = new StringBuilder(input).reverse().toString();
        if (input.equals(reverseString)){

        }else{
            string = "False";
        }
        return string;
    }

    public String thirdOutputPalindrome(String input){
        String string = "racecar";
        String reverseString = new StringBuilder(input).reverse().toString();
        if (input.equals(reverseString)){

        }else{
            string = "False";
        }
        return string;
    }
}
