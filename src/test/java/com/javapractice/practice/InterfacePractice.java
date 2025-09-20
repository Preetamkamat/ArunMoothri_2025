package com.javapractice.practice;

interface InterfTest {
    abstract void m1();

    abstract void m2();
}

public class InterfacePractice implements InterfTest {
    public static void main(String[] args) {
        InterfacePractice i = new InterfacePractice();
        i.m1();
    }

    @Override
    public void m1() {
        System.out.println("M1 Method");
    }

    @Override
    public void m2() {

    }
}

class interface2 extends InterfacePractice {
    @Override
    public void m2() {
        System.out.println("M2 Method");
    }
}

