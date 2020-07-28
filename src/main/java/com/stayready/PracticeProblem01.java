package com.stayready;

public class PracticeProblem01 {

    public boolean isPalindrome(String input){
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(input);
        reverseString.reverse();

        if(input.equalsIgnoreCase(reverseString.toString()))
            return true;

        return false;
    }

    public String getSubstring(String input){
        return null;
    }

    public String getSubPalindrome(String input){
        /*String output = "";

        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j < input.length(); j++){
                if()
            }
        }*/
        return null;
    }
}
