package com.stayready;

import java.util.ArrayList;

public class PracticeProblem01 {
    StringBuilder output = new StringBuilder();
    ArrayList<String> parts = new ArrayList<>();

    public boolean isPalindrome(String str) {
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String palindromicPartitions(String str) {
        if (isPalindrome(str)) {
            return subStringPalindrome(str);
        } else {
            return null;
        }
    }


    public String subStringPalindrome(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    output.append(sub + " ");
                }
            }
            output.append("\n");
        }
        return output.toString();
    }


}
