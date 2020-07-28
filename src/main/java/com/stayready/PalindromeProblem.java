package com.stayready;

public class PalindromeProblem {

    public boolean isStringPalindrome(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        return input.equals(reversedString.toString());
    }

    public String findAllPalindromicPartitions(String input) {
        StringBuilder palindromePartitions = new StringBuilder();
        int length = input.length();
        if(length == 0 || length == 1) {
            return input;
        }
        int middle = 0, before = 0, after = 0;
        String beginning = "", middleString = "", end = "";
        if(isStringPalindrome(input)) {
            if(isStringEvenLength(length)) {
            }
            else {
                middle = length / 2;
                before = middle;
                after = middle;
                while((after + 1) - (before - 1) != length) {
                    before = before - 1;
                    after = after + 2;
                    middleString = input.substring(before, after);
                    beginning = input.substring(0, before);
                    end = input.substring(after);
                    palindromePartitions.append(beginning + " " + middleString + " " + end + "\n");
                }

            }
            int index = 0;
            for(Character letter: input.toCharArray()) {
                if(index + 1 != length) {
                    palindromePartitions.append(letter + " ");
                }
                else {
                    palindromePartitions.append(letter);
                }
                index++;
            }
        }
        return palindromePartitions.reverse().toString();
    }

    public boolean isStringEvenLength(int length) {
        return length % 2 == 0;
    }

    public boolean isStringOddLength(int length) {
        return length % 2 == 1;
    }
}
