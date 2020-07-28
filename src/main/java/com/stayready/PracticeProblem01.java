package com.stayready;

import java.util.Arrays;
import java.util.logging.Logger;

public class PracticeProblem01 {

    private static Logger log = Logger.getGlobal();

    public boolean isPalindrome(String input){
        int count = 0;
        int s = input.length()-1;
        char [] letters = input.toCharArray();
        for(int b = 0; b < s; b++){
            if(letters[b] != letters[s]){
                return false;
            }
            s--;
        }
        return true;
    }

    public String getPartitions(String input){
        String partitions = "";
        if(isPalindrome(input)){
            for(char l: input.toCharArray()){
                partitions += l + " ";
            }
            partitions = partitions.trim();
        }else{
            log.info("This String is not a Palindrome.");
            partitions = null;
        }
        return partitions;
    }

    public String getFirstPartitions(String input){
        String partitions = "";
        if(isPalindrome(input)){
            if(input.length() < 3){
                return getPartitions(input);
            }
            for(char l: input.toCharArray()){
                partitions = input.substring(0,1) + " " +input.substring(1, input.length()-1) + " " + input.substring(input.length()-1);
            }
        }else{
            log.info("This String is not a Palindrome.");
            partitions = null;
        }
        return partitions;
    }

    public String getSecondPartitions(String input){
        String partitions = "";
        if(isPalindrome(input)){
            if(input.length() < 5){
                return getFirstPartitions(input);
            }
            for(char l: input.toCharArray()){
                partitions = input.substring(0,1) + " " + input.substring(1,2) + " "+input.substring(2, input.length()-2) + " " +input.substring(input.length()-2, input.length()-1)+" "+ input.substring(input.length()-1);
            }
        }else{
            log.info("This String is not a Palindrome.");
            partitions = null;
        }
        return partitions;
    }
}
