package org.example;

public class CountlettercountinString {

    public static void main(String[] args) {
//        //1)Using Iteration
//        String input = "SanuriPerera";
//        char toFind='a';
//
//        int count =0;
//
//        input=input.toLowerCase();
//
//        for(int i=1;i<input.length();i++){
//            if(input.charAt(i)==toFind){
//                count++;
//            }
//        }
//        System.out.println(toFind + " is present "+ count + " Number of times");

//        2) Using without Iteration
        String input = "SanuriPerera";
        char toFind='a';

        input=input.toUpperCase();

        String charToFind=Character.toString(toFind).toUpperCase();
        int actualLength= input.length();
        System.out.println(actualLength);

        input = input.replace(charToFind,"");
        int leangthafterReplacing= input.length();
        System.out.println(leangthafterReplacing);

        System.out.println(actualLength-leangthafterReplacing);
    }

}
