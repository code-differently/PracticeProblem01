package com.stayready;

public class PalindromChecker {
    static boolean isPalidrone(String str){
        StringBuilder test=new StringBuilder(str);
        test.reverse();
        String reversed=test.toString();
        return str.equals(reversed);
    }

    static String palindromPartitions(String str){
        String output="";
        for (int i = 0; i < str.length()/2; i++) {
            String check=str.substring(i,str.length()-i);
            if(isPalidrone(check)){
                output+=check.replaceAll(".","$0 ")+"\n";
            }
        }
        return output.trim();

    }
}
