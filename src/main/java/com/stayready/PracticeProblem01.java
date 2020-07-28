package com.stayready;

public class PracticeProblem01 {
    public boolean isPalindrome(String word){
        boolean isPalindrome = false;
        String reversedWord = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        if(word.equalsIgnoreCase(reversedWord)){
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public String palindromePartitions(String word){
        String output = "";
        String newWord = word;
        while(isPalindrome(newWord)){
            for(int i = 0; i < newWord.length(); i++){
                if (i == 0) {
                    for(int j = 0; j < word.length(); j++) {
                        output += newWord.charAt(j) + " ";
                    }
                    newWord = word.substring(i + 1, word.length() - (i + 1));
                } else {
                    String first = word.substring(0, i);
                    String middle = newWord;
                    String last = word.substring(newWord.length() + i);
                    output += "\n" + first + " " + middle + " " + last;
                    newWord = word.substring(i + 1, word.length() - i + 1);
                }
            }
        }
        return output;
    }
}
