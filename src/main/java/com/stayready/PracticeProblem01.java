package com.stayready;

public class PracticeProblem01 {
    public boolean getSubPalindroms(String input01) {
        int n = input01.length();
        for (int i = 0; i < (n/2); i++) {
            if (input01.charAt(i) != input01.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public Boolean getSubPalindroms1(String input01) {
        // r is a palin by itself now have to figure out how to check if each character is one
        return null;
    }

    public Boolean getSubPalindroms2(String input01) {
        return null;
    }

    public Boolean getSubPalindroms3(String input01) {
        return null;
    }

}
