package org.example;

import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args) {
//        Scanner class used to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");

        int number = scanner.nextInt();
        if(number % 2==0){
            System.out.println("The entered numer is even");
        }else{
            System.out.println("The entered number is odd");
        }
    }
    
}
