package org.example;

import java.util.Scanner;

public class FindalphabetPosition {
    public static void main(String[] args) {
        //find the position of an English alphabet
        //ASCII  => a - 97 , A - 65
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a English Letter :");

        char letter = sc.next().charAt(0);
        letter = Character.toLowerCase(letter);

        int asciValue =(int) letter;
        System.out.println(asciValue);

        int position = asciValue - 96;
        System.out.println(position);
    }
}
