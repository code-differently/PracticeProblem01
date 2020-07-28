package com.stayready;

import java.util.ArrayList;

public class PracticeProblem01 
{
    //Storage for the possible palindromes
    ArrayList <String> storage = new ArrayList<>();
    public PracticeProblem01()
    {

    }

    //To get the ArrayList that'll store the possibilities
    public ArrayList getStoredPossibles()
    {
        return storage;
    }

    //To print oout the storage
    public void printStoredPossibles()
    {
        if (storage.size() == 0)
        {
            System.out.println("Storage is empty use checkPalinPossible() method first");
        }
        else
        {
            for (int i = 0; i < storage.size();i++)
            {
                System.out.println(storage.get(i));
            }
        }
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
