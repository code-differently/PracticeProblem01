package com.stayready;

import java.util.ArrayList;
import java.util.HashSet;

public class PracticeProblem01 {

    public static boolean isPalindrone(String word){
        HashSet<Character> temp = new HashSet<>();

        for (int i=0; i<word.length(); i++){
            if(!temp.add(word.charAt(i)))
                temp.remove(word.charAt(i));
        }
        if(temp.isEmpty() || temp.size() == 1)
            return true;
        else
            return false;
    }


}
