package com.qauber.catalog;

import java.util.Scanner;

public class Wap1 {
    public static void main(String[] args ){
        System.out.println("Input number 1 and number 2: ");
        Scanner x1 = new Scanner(System.in);
        int number1,number2;
        number1 = x1.nextInt();
        number2 = x1.nextInt();
        System.out.println("Sum of number 1 and number 2 is: " + (number1+number2));
        System.out.println("Roman is cool");
    }
}
