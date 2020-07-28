package com.stayready;



public class PracticeProblem01 {

    /*

    r a c e c a r

    race

    r
    r a
    r a c
    r a c e
    r a c e c
    r a c e c a
    r a c e c a r



    //
    check if first = last letter
    second = second last letter





    We separate letters


    iterate one letter before[0]

    racecar

    a


    one letter behind, if possible

    So we need a method to check if palindrome
    continuously checking palindrome

     So we need a method to check if palindrome
     We a method before that will iterate through the String

     we also need to create possibly a string that will hold possibilties
     */
    String stringOfPalindromes = "";
    public Boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public String checkLetters(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (isPalindrome(str) == true) {
                stringOfPalindromes += "/n" + str;
            }
        }

            j = j - 1;
            i = i  + 1;
            str = str.substring(i , j-1);

        return stringOfPalindromes;
    }

}
