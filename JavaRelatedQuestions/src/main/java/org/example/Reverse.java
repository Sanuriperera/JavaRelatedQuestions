package org.example;

public class Reverse {
    public static void main(String[] args) {
        //1) lenght and chartAt
        String str = "ABCD";
        String rev ="";
        int length = str.length();

        System.out.println(str.charAt(0));

        for(int i =length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }

        System.out.println("Reverse text: "+ rev);
    }



}
