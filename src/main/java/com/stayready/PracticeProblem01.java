package com.stayready;

public class PracticeProblem01 {

    public Boolean isPalindrom(String word) {
        StringBuilder reverseWord = new StringBuilder();
        char[] charactersArr = word.toCharArray();
        for (int index = 0; index <charactersArr.length; index++) {
            reverseWord.append(charactersArr[index]).toString();
        }
        return (reverseWord.toString()).equals(word);
    }

    public Boolean checkIfPalindrom(String w) {
        char[] charsArr = w.toCharArray();
        StringBuilder palindormWord = new StringBuilder();
        for(int index = 0; index < charsArr.length; index++) {
            if (w.substring(0).equals(w.substring(charsArr.length))) {
                palindormWord.append(charsArr);
            }
        }
        return (palindormWord.toString()).equals(w);
    }
}
