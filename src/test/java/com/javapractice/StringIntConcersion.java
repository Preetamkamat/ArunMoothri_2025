package com.javapractice;

public class StringIntConcersion {
    public static void main(String[] args) {
        String s = "12345";
        int num = Integer.parseInt(s);
        System.out.println("String to Int conversion: " + num);
        int n = 12345;
        String str = Integer.toString(n);
        System.out.println("Int to String conversion: " + str);



     /*  String s = "12345";
        int num = Integer.parseInt(s);
        System.out.println("String to Integer conversion: " + num);
        int n = 12345;
        String str = Integer.toString(n);
        System.out.println("Integer to String Conversion: " + str);*/
    }
}
