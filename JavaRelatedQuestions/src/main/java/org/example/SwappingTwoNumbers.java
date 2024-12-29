package org.example;

public class SwappingTwoNumbers {
    static int a =10;
    static int b= 20;
    public static void main(String[] args) {
//        int a =10;
//        int b= 20;
        System.out.println("Before swapping values are :"+a+" , "+b);
//        System.out.println("-----first method------");
//        methodOne();
//        System.out.println("-----second method------");
//        methodTwo();
        System.out.println("-----third method------");
        methodThree();
    }

    // using 3rd variable
    public static void methodOne(){
        int c = a; //10
         a=b; //20
         b=c; // 10
        System.out.println("After swapping values are :"+a+" , "+b);

    }

    //2) Use + and - without using 3rd variable
    public static void methodTwo() {
        a=a+b; // 10+20 = 30
        b=a-b; // 30-20= 10
        a=a-b; //30-10=20
        System.out.println("After swapping values are :" + a + " , " + b);
    }

    //3) Use * and / Without using third variable
    public static void methodThree(){
        a=a*b; //10*20 =200
        b=a/b; //200/20 = 10
        a=a/b; //200/10 =20

        System.out.println("After swapping values are :" + a + " , " + b);
    }}
