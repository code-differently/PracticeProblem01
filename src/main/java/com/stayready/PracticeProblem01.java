package com.stayready;

import java.util.ArrayList;


public class PracticeProblem01 {
    public boolean isAPal(String str){
        char[] chr = str.toCharArray();
        int palAdvance = 0;
        boolean isPally = true;
        palAdvance = chr.length / 2;
        for (int i = 0; i < palAdvance; i++) {
            if (chr[i] != chr[(chr.length-1) - i]) {
                isPally = false;
            }
        }
        return isPally;
    }

    public String partitionOne(String str){
        char[] chrArray = str.toCharArray();
        String result = "";
        //Need to rewrite to a regular for
        //In order to make rawlings window type beat
        /*for(char c: chrArray){
            result += c;
            result += " ";
        }*/
        for(int i = 0; i<chrArray.length; i++){
            result += chrArray[i];
            result+= " ";
        }
        return result.trim();
    }


    //serious solution
    //numOfStringss returned = str len int divided by 2 sosa
    public ArrayList partitionGen(String str){
        if(isAPal(str) == false){
            return null;
        }
        ArrayList<String> partitionTypeBeat = new ArrayList();
        char[] chrArray = str.toCharArray();
        ArrayList charlist = new ArrayList();
        for(char c: chrArray){
            charlist.add(c);
        }
        ArrayList<Integer> left = new ArrayList();
        ArrayList<Integer> right = new ArrayList();
        String result = "";
        int numOfStrings = str.length() / 2;
        int rawleft = 1;
        int rawright = str.length();
        int counter=1;
        for(int num = numOfStrings; num>0; num--){
            ArrayList listy = (ArrayList) charlist.clone();
            rawleft = 1;
            
            /*
            listy.add(1, " ");
            listy.add(7, " ");
            listy.add(3, " ");
            listy.add(7, " ");
            listy.add(5, " ");
            listy.add(7," ");*/
            for(int z = 0; z< counter; z++){
                listy.add(rawleft, " ");
                listy.add(rawright, " ");
                rawleft+=2;
            }
            
            counter += 1;
            partitionTypeBeat.add(listy.toString());
        }
        
        return partitionTypeBeat;
    }
}
