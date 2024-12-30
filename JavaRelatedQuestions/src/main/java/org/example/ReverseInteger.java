package org.example;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your prefer number");
        int number = sc.nextInt(); //1234
//        methodOne(number);
        methodTwo(number);
    }

    //1) method one - Using algorithm
    public static void methodOne(int number){
        int rev = 0;
        while (number !=0){
            rev=rev * 10+number%10; //0+4 =4 --> second iteration -> (4*10=(40)+123%10=(3))= 40+3= 43
            number=number/10; // 123 --> second iteration -> 123/10->12
        }

        System.out.println("Reverse number is"+rev);
    }

    //2) Using StringBuffer Class
    public static void methodTwo(int number){
     StringBuffer   rev ;
     StringBuffer sb = new StringBuffer(String.valueOf(number));
     rev = sb.reverse();
        System.out.println("Reverse number is: "+rev);
    }
}
