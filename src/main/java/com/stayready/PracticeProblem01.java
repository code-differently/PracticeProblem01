package com.stayready;



public class PracticeProblem01 {

    public Boolean isPalindrome(String input){
        return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
    }
    public String makeItHappen(String input){
        String sub, solution;
        solution = "";
        int c, length;
        length = input.length();
        for (c = 0; c < length; c++){
            sub = input.substring(c, c+1);
            if (isPalindrome(sub)){
                solution += sub;
                solution += " ";
            }
        }
        return solution.trim();
    }
}
