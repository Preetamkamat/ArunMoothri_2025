package com.javapractice;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String s = "Automation world";
        s = s.toLowerCase();
        int vowel = 0, consonant = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Vowels are: " + vowel + " Consonant are: " + consonant);
    }
}

