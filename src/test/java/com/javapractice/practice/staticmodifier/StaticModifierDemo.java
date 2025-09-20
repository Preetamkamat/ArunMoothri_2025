package com.javapractice.practice.staticmodifier;


public class StaticModifierDemo {
    /*
    Static modifier is applicable for methods and variable and inner classes

     */
    static int x = 0;
    int y = 0;

    public static void m1() {
        System.out.println("Static M1 Method");
    }

    public static void main(String[] args) {
        m1();
        StaticModifierDemo s = new StaticModifierDemo();
        int y = 10;
        System.out.println(y);
    }
}
