package org.example;

public class Reverse {

    static String str = "ABCD";
    static int length = str.length();

    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

    public static void methodOne(){
        String rev ="";
        //1) lenght and chartAt
        System.out.println(str.charAt(0));

        for(int i =length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse text: "+ rev);
    }

    public static void methodTwo(){
        //toCharArray
        String rev2="";
        char [] a= str.toCharArray();
        for(int i =a.length-1;i>=0;i--){
           rev2= rev2+a[i] ;
        }
        System.out.println("Reverse text using toCharArray : "+ rev2);
    }

}
