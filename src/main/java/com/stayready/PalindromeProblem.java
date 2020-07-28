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
            allPalindromes.append(computeIndividualCharacters(input));
            allPalindromes.append(findPalindromeLengthTwoOrMore(input));
        }
        return allPalindromes.toString();
    }

    private String computeIndividualCharacters(String input) {
        StringBuilder individualCharacters = new StringBuilder();
        int index = 0;
        for(Character letter: input.toCharArray()) {
            individualCharacters.append(index + 1 < input.length() ? letter + " " : letter);
            index++;
        }
        individualCharacters.append("\n");
        return individualCharacters.toString();
    }

    private String findPalindromeLengthTwoOrMore(String input) {
        StringBuilder palindromePartitions = new StringBuilder();
        int start = 1;
        int end = input.length() - 1;
        while(start != end - 1) {
            palindromePartitions.append(input.substring(0, start) + " " + input.substring(start, end) + " " + input.substring(end) +"\n");
            start++;
            end--;
        }
        int indexOfLastNewLine = palindromePartitions.lastIndexOf("\n");
        return palindromePartitions.toString().substring(0, indexOfLastNewLine);
    }
}
