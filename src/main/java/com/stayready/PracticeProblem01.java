package com.stayready;

public class PracticeProblem01 {

    public String findPalindromicSubstrings (String input) {
        StringBuilder ret = new StringBuilder();

        for(int start = 0; start < input.length(); start++) {
            for(int end = start + 1; end <= input.length(); end++) {
                String sub = input.substring(start, end);
                if(isPalindrome(sub)) {
                    ret.append(sub).append("\n");
                }
            }
        }

        return ret.toString().trim();
    }

    public String findAllPalindromicPartitions(String input) {
        StringBuilder ret = new StringBuilder();
        ret.append(getSinglePartitions(input)).append("\n");
        // recur rest of substrings with partitions

        return ret.toString().trim();
    }

    public boolean isPalindrome(String input) {
        StringBuilder reverseInput = new StringBuilder(input);
        reverseInput.reverse();
        return reverseInput.toString().equals(input);
    }

    public String getSinglePartitions(String input) {
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            ret.append(input.charAt(i)).append(" ");
        }
        return ret.toString().trim();
    }

}
