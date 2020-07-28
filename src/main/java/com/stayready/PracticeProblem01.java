package com.stayready;

public class PracticeProblem01 
{
    public boolean isPalindrone(String input)
    {
        int x = input.length() - 1;

        char [] letters = input.toCharArray();

        for(int i = 0; i < x; i++)
        {
            if(letters[i] != letters[x])
            {
                return false;
            }

            x--;
        }

        return true;
    }
}
