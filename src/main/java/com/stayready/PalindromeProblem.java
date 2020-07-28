package com.stayready;

public class PalindromeProblem {

    public boolean isStringPalindrome(String input) {
        StringBuilder reverse = new StringBuilder(input).reverse();
        return input.equals(reverse.toString());
    }

    public String findAllPalindromicPartitions(String input) {
        int lengthOfInputString = input.length();
        if(lengthOfInputString == 0 || lengthOfInputString == 1) {
            return input;
        }
        StringBuilder allPalindromes = new StringBuilder();
        if(isStringPalindrome(input)) {
            allPalindromes.append(findPalindromeLengthTwoOrMore(input));
        }
        return allPalindromes.toString();
    }

    private String findPalindromeLengthTwoOrMore(String input) {
        input = input.replaceAll("", " ");
        input = input.replaceFirst(" ", "");
        //replace last
        input = input.substring(0, input.length() - 1);
        StringBuilder palindromePartitions = new StringBuilder(input + "\n");
        int start = 1;
        int end = input.length() - 1;
        while(start < end) {
            String palindromeSubset = input.substring(0, start) + " " + input.substring(start, end).replaceAll(" ", "") + " " + input.substring(end) +"\n";
            if(!palindromePartitions.toString().contains(palindromeSubset)) {
                palindromePartitions.append(palindromeSubset);
            }
            //there are spaces in the string, so I want to skip those
            start += 2;
            end -= 2;
        }
        int indexOfLastNewLine = palindromePartitions.lastIndexOf("\n");
        return palindromePartitions.toString().substring(0, indexOfLastNewLine);
    }
}
