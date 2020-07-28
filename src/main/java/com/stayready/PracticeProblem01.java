package com.stayready;

public class PracticeProblem01 {

    public boolean isPalindrome(String input){

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public Integer getSubPalindroms(String input){

        String str;
        int substrings = input.length();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j < input.length(); j++) {
                str = input.substring(i, j);
                //
            }
        }
        return substrings;

    }
}
