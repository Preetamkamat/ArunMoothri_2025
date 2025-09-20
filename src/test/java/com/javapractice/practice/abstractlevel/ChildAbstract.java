package com.javapractice.practice.abstractlevel;

public class ChildAbstract extends AbstractClassLvlDemo {

    /*    child class is responsible to providing implementation for parent class abstract methods
        THe following are illegal combination with abstract modifier:
        final, native synchronized, strictfp,


     */
    public static void main(String[] args) {
        ChildAbstract c = new ChildAbstract();
        c.m1();
        c.m2();
    }

    @Override
    public void m1() {
        System.out.println("M1 method");
    }

    @Override
    public void m2() {
        System.out.println("M2 Method");
    }
}
