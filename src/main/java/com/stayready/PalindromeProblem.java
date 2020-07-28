package com.stayready;

public class PalindromeProblem {

    public boolean isStringPalindrome(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        return input.equals(reversedString.toString());
    }

    public String findOnePalindromicPartitions(String input) {
        return "";
    }
}
