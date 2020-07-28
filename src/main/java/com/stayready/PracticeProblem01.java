package com.stayready;

public class PracticeProblem01 {

    //Step one check if it is a palindrome 
    public Boolean isPalindrome(String input)
    {
        Boolean isPalindrome = true; //assume the string is a palindrome
        int j = input.length()-1; //variable starting at the end of the string
        for (int i = 0; i < input.length(); i++)  //Loop to go through the array
        {
            if (input.charAt(i) != input.charAt(j)) //if the letter at the end are not the same then the string isn't a palindrome
            {
                isPalindrome = false;   
            }
            j--; //decrement 
        }
        return isPalindrome; 
    }
    //step two get all possible substrings of the palindrome
    public String subStrings (String input)
    {
        String substrings = ""; //sorry tariq I know you hate nested for loops 
        for (int i = 0; i < input.length(); i++)  //loop that goes through the string
        {
            for (int j = i+1; j <= input.length(); j++) //loop that is ahead of the one above that goes through string
            {
                substrings+= input.substring(i, j); 
                substrings+="\n";
            }
        }
        return substrings.trim();
    }

    //step three out put all the substings that are palindrome

    public String palindromePartitions(String input)
    {
        String palindromePartition = "";
        String subStrings = subStrings(input); //get all possible substrings
        String [] strings = subStrings.split("\n"); //place them into a string array
        for (int i = 0; i < strings.length; i++) //loop to go through an array
        {
            if(isPalindrome(strings[i]) == true) //if the string is a palindrome add it to the set string variable
            {
                palindromePartition += strings[i];
            }
            palindromePartition += "\n";
        } 
        return palindromePartition.trim();
    }
}
