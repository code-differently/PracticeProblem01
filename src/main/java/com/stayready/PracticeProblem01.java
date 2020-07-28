package com.stayready;

public class PracticeProblem01 {
    String word;

    public void PracticeProblem01(String word){
        this.word = word;

    }

    public boolean isPalindrome(String word){
        String reversedWord = " ";
        for(int i = word.length()-1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        String newWord = reversedWord.trim();
        if(word.equals(newWord)){
            return true;
        }else{
            return false;
        }

    }


    public String palindromicPartitions(String word){
        String moreWords = " ";
        char[] wordCharacters = word.toCharArray();
        String newWord = " ";
        for(int i = 0; i <= wordCharacters.length; i++){
            moreWords = newWord.substring(i, i+1);
            moreWords += " ";
        }

        return moreWords;
    }
}
