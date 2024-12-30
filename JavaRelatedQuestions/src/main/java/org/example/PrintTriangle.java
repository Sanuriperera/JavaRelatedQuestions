package org.example;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows/colum that you want");
        int numberLines = sc.nextInt();
//        starPattern(numberLines);
        numberPattern(numberLines);
    }

    //1) First using *
    public static void starPattern(int numberLines){
        int row,column =0;
        for(row=0;row<numberLines;row++){
            for(column=0;column<=row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //2)  incrementing number
    public static void numberPattern(int numberLines){
        int startingNumber = 1;
        int row,column;

        for(row=0;row<numberLines;row++){
            for(column=0;column<=row;column++){
                System.out.print(startingNumber);
                startingNumber++;
            }
            System.out.println();
        }
    }
}
