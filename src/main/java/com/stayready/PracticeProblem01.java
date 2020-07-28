package com.stayready;

import java.util.ArrayList;

public class PracticeProblem01 {

    public String Palindrome(String input) {
        for(int i = 0; i < input.length(); i++) {
        

        }
        return null;
    }

    public boolean isPalindrome(String input) {
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != input.charAt(input.length()-1)) {
                return false;
            }
        }
        return true;
    }
}
