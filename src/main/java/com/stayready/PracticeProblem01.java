package com.stayready;

import java.util.ArrayList;

public class PracticeProblem01 
{
    ArrayList <String> storage = new ArrayList<>();
    public PracticeProblem01()
    {

    }

    public ArrayList getStoredPossibles()
    {
        return storage;
    }


    //Method to return an a list of possible palindromes from a string
    public void checkPalinPossible(String input)
    {
        for(int i = 0; i < input.length();i++)
        {
            for (int j = input.length();j > i;j--)
            {
                String getter = input.substring(i, j);
                if (isPalin(getter))
                {
                    storage.add(getter);
                }
            }
        }
    }

    //Method to check if a string is a palindrome
    public boolean isPalin(String input)
    {
        //Int to go through the beginning of the string input
        int i = 0; 
        int j = input.length()-1;
        while (i < j)
        {
            if (input.charAt(i)!= input.charAt(j))
            {
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}
