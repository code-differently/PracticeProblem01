package com.stayready;

public class PracticeProblem01 {

    public static void main(String[] args) {
        PracticeProblem01 palindrome = new PracticeProblem01();

        String input = "r a c e c a r";

        if (palindrome.isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    // check for palindrome
    public static boolean isPalindrome(String str) {
        int begin = 0; // starts from beginning of string
        int end = str.length() - 1; // starts from end of string

        while (begin < end) { // compare first character to last character
            if (str.charAt(begin) != str.charAt(end)) // if ending & beginning do not match
                return false; // return false
            begin++;
            end--;
        }
        return true; // if ending & beginning match loop inward
    }
}