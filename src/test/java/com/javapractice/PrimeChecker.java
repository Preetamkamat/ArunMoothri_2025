package com.javapractice;

public class PrimeChecker {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;
        if (num <= 0) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % 2 == 0) {
                    isPrime = true;
                    break;
                }
            }
            System.out.println(num + " is prime: " + isPrime);
        }
    }
}
