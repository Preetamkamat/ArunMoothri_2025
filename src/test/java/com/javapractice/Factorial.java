package com.javapractice;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial);


       /*int num = 5;
// Loop method
        int factorial1 = 1;
        for (int i = 1; i <= num; i++) {
            factorial1 *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial1 );*/
    }
}
