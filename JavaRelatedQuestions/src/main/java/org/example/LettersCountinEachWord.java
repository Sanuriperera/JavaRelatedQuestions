package org.example;

import java.util.HashMap;

public class LettersCountinEachWord {
    public static void main(String[] args) {
        countEachWord("Sanuri");
    }
    public static void countEachWord(String typed_name){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] chartArray = typed_name.toCharArray();

        for (Character c:chartArray){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        System.out.println(map);
    }

}
