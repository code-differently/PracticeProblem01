package com.stayready;

public class PracticeProblem01 {

    public static boolean isPalindrom(String text){

        StringBuilder str = new StringBuilder(text);

        String reverse = str.reverse().toString().toLowerCase();
        //Make sure it's not case sensitive!

        return reverse.equals(text);
    }

    public static String partition(String text){

        if(!isPalindrom(text)){ //check for palindrom

            //If not palindrom, exit the method
            return "Impossible! This is not a palindrom!";

        }

        String result = "";

        for(int i = 0; i < text.length(); i++){

            result+= text.charAt(i) + " ";

        }

        return result.trim().toLowerCase();


    }

    public static String allPartitions(String text){

        //check for palindrom
        if(!isPalindrom(text)){ 

            //If not palindrom, exit the method
            return "Impossible! This is not a palindrom!";

        }

        String result = "";

        result += partition(text) + "\n"; //Find first possible combination

        //Get the rest
        



        return result;
    }
}
