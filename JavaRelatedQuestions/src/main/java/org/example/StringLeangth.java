package org.example;

public class StringLeangth {
    //Find the length of the string without length method
    public static void main(String[] args) {
        String givenString = "LearnAutomation";
        //Find the length of the string with length method
        System.out.println(givenString.length());

        char[] charArray = givenString.toCharArray();

        int lenght =0;
        for (Character c:charArray){
            lenght++;
        }

        System.out.println(lenght);
    }

}
