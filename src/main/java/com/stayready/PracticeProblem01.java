package com.stayready;

import java.util.HashMap;

public class PracticeProblem01 {

    private String pali;
    private String center;
    private HashMap<Character,Integer> letterCount;

    public static void main(String [] args) {

        PracticeProblem01 temp = new PracticeProblem01();
        temp.setPali("racecar");
        temp.setLetterCount();
        temp.findCenter();
        System.out.println(temp.getCenter());


    }

    public PracticeProblem01() {

        pali = "";
        center = "";
        letterCount = new HashMap<>();
    }

    private void updateMap(Character x) {

        if(!letterCount.containsKey(x)) {
            letterCount.put(x, 1);


        } else {

            letterCount.put(x, letterCount.get(x) + 1);

        }

    }
    private boolean paliIsEven(){

        if (getPali().length() % 2 == 0) {

            return true;
        } else {

            return false;
        }

    }

    public void setLetterCount() {

        for (int i = 0; i < getPali().length(); i++) {

            updateMap(getPali().charAt(i));
        }
    }

    public void findCenter() {

        if (paliIsEven() == false) {

            for (Character key : letterCount.keySet()) {
                Integer value = letterCount.get(key);
                if(value == 1) {

                    center += key;
                }
            }

        } else {

        }

    }

    private String getPali() {
        return pali;
    }

    public void setPali(String pali) {
        this.pali = pali;
    }

    public HashMap<Character, Integer> getLetterCount() {
        return letterCount;
    }

    public String getCenter() {
        return center;
    }


}
