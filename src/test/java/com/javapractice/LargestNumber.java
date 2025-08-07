package com.javapractice;

public class LargestNumber {
    public static void main(String[] args) {
       int[] a = {1, 10, 5, 25, 8, 50, 15, 3};
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Largest Number is : " + max);
    }
}
