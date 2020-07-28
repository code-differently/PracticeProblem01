package com.stayready;

public class PalindromeProblem {

    public boolean isStringPalindrome(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        return input.equals(reversedString.toString());
    }

    public String findOnePalindromicPartitions(String input) {
        StringBuilder palindromePartitions = new StringBuilder();
        for(Character letter: input.toCharArray()) {
            palindromePartitions.append(letter + " ");
        }
        return palindromePartitions.toString();
    }
}
