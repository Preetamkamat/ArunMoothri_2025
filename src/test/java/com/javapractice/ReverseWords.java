package com.javapractice;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Java Coding Interview";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reverseWords = new StringBuilder(word).reverse();
            result.append(reverseWords.append(" "));
        }
        System.out.println("Reverse Words: " + result);

        //        String s = "Java Coding Interview";
//        String[] word = s.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        for (String words : word) {
//            StringBuilder reverseWord = new StringBuilder(words).reverse();
//            result.append(reverseWord.append(" "));
//        }
//        System.out.println(result.toString().trim());
    }
}
