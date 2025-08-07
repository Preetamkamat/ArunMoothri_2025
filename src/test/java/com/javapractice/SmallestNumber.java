package com.javapractice;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 1, 30, 100, 80};
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
