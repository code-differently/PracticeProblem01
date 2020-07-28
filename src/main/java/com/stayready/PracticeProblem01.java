package com.stayready;

public class PracticeProblem01 {

    public static void main(String[] args) {

        PracticeProblem01 palindrome = new PracticeProblem01();

        String input = "r a c e c a r";

        if (palindrome.isPalindrome(input))
            System.out.println("\"" + input + "\" is a palindrome.");
        else
            System.out.println("\"" + input + "\" is not a palindrome.");

    }

    static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
