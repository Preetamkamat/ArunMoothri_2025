package com.javapractice;

import java.util.ArrayList;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList even = new ArrayList<>();
        ArrayList odd = new ArrayList<>();
        for (int num : number) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("Even numbers are: " + even);
        System.out.println("Even numbers are: " + odd);
//        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//       // ArrayList even = new ArrayList<>();
//        ArrayList odd = new ArrayList<>();
//        for (int num : number) {
//            if (num % 2 == 0) {
//                even.add(num);
//            } else {
//                odd.add(num);
//            }
//        }
//        System.out.println("Even Numbers are: " + even);
//        System.out.println("Odd Numbers are: " + odd);*/
    }
}
