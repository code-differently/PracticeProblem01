package com.stayready;

public class PalindromeProblem {

    public boolean isStringPalindrome(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        return input.equals(reversedString.toString());
    }

    public String findAllPalindromicPartitions(String input) {
        StringBuilder palindromePartitions = new StringBuilder();
        int startIndex = 0;
        int endIndex = input.length();
        if(isStringPalindrome(input)) {
            for(Character letter: input.toCharArray()) {
                palindromePartitions.append(letter + " ");
            }
        }
        return palindromePartitions.toString();
    }

    public boolean isStringEvenLength(String input) {
        return false;
    }
}
