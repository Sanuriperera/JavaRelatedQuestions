package org.example;

import java.util.*;

public class Reverse {

    static String str = "ABCD";
    static int length = str.length();

    public static void main(String[] args) {
//        methodOne();
//        methodTwo();
//        methodThree();
        ;methodFour();

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

    public static void methodThree() {
        //3) StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }

    //4) Using Collections
    public static void methodFour(){
        char[] a= str.toCharArray();
        List <Character> list = new ArrayList<Character>();

        for(Character character:a){
            list.add(character);
        }

        Collections.reverse(list);
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }

    }
}
