package com.javapractice;

public class SwapNumbers {
    public static void main(String[] args) {
/*        int a = 10;
        int b = 15;
        System.out.println("Before: a = " + a + " b = " + b);
        a = a + b; // 10 + 15 = a =  25
        b = a - b; // 25 - 15 = b =  10
        a = a - b; // 25 - 10 = a =  15
        System.out.println("After: a = " + a + " b = " + b);*/

        int a = 10;
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a :-" + a + " b :-" + b);

    }
}
