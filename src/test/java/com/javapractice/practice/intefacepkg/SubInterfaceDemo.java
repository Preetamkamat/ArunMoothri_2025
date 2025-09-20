package com.javapractice.practice.intefacepkg;

public class SubInterfaceDemo extends InterfaceDemo implements InterfRight {
    public static void main(String[] args) {
        SubInterfaceDemo s = new SubInterfaceDemo();
        s.m1(10);
        s.m1();

    }

    public void m1(int i) {
        System.out.println("M1(int i)");
    }
}
