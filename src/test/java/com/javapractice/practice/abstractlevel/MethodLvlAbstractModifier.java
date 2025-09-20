package com.javapractice.practice.abstractlevel;

import com.sun.jdi.Method;

import java.sql.SQLOutput;

public abstract class MethodLvlAbstractModifier {

    public abstract void m1();

    private void m2() {
        System.out.println("M2 method");
    }
}

interface Test {
    void m1();

    void m2();
}

class Demo extends MethodLvlAbstractModifier {
    public static void main(String[] args) {

        ;
    }

    public void m2() {

    }

    public void m1() {

    }
}