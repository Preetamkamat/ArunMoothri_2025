package com.javapractice;

public class Demo {
    public static void main(String[] args) {
        String s1 = "abcdthik";
        String s2 = "abdchtig";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println(s2.charAt(i));
            }
        }
    }
}
