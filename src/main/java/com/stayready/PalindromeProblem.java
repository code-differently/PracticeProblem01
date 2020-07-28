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

//    private String computeCharactersBefore(String input, int howFar) {
//        StringBuilder individualCharacters = new StringBuilder();
//        for(int index = 0; index < howFar; index++) {
//            Character letter = input.charAt(index);
//            individualCharacters.append(index + 1 < howFar ? letter + " " : letter);
//        }
//        return individualCharacters.toString();
//    }
//
//    private String computeCharactersAfter(String input, int howFar) {
//        StringBuilder individualCharacters = new StringBuilder();
//        int length = input.length();
//        for(int index = length - 1; index >= length - howFar; index--) {
//            Character letter = input.charAt(index);
//            individualCharacters.append(index + 1 < howFar ? letter + " " : letter);
//        }
//        return individualCharacters.toString();
//    }

    private String findPalindromeLengthTwoOrMore(String input) {
        input = input.replaceAll("", " ");
        input = input.replaceFirst(" ", "");
        input = input.substring(0, input.length() - 1);
        StringBuilder palindromePartitions = new StringBuilder(input + "\n");
        int start = 1;
        int end = input.length() - 1;
        while(start < end) {
            String beginning = input.substring(0, start);
            String middle = input.substring(start, end).replaceAll(" ", "");
            String ending = input.substring(end);
            String palindromeSubset = beginning + " " + middle + " " + ending +"\n";
            if(!palindromePartitions.toString().contains(palindromeSubset)) {
                palindromePartitions.append(palindromeSubset);
            }
            //there are spaces in the string
            start += 2;
            end -= 2;
        }
        int indexOfLastNewLine = palindromePartitions.lastIndexOf("\n");
        return palindromePartitions.toString().substring(0, indexOfLastNewLine);
    }
}
