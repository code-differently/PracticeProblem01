package com.stayready;

import java.util.ArrayList;

public class PracticeProblem01 {

    public boolean partitionPalindrome(String input){
    //Method to check if string is palindrome
        //input = "n u r s e s r u n";
        //ArrayList<String> palindrome = new ArrayList<>(list);
        int leng = input.length();
        leng--;

        for (int i=0; i < leng; i++)
        {
            if(input.charAt(i) != input.charAt(leng))
                return false;
                leng--;
        }
        return true;
    }

    public String printPalindromePartition(String input){
    //Method to return list of possible palindromes
        ArrayList<ArrayList<String>> storePart = new ArrayList<>();
        for(ArrayList<String> i: storePart)
        {
            for(String j: i){
                
            }
            System.out.println();
        }
        return input; 
    }
    
    }



    

