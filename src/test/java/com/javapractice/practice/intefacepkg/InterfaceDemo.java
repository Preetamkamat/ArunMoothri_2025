package com.javapractice.practice.intefacepkg;

import com.javapractice.practice.InterfacePractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

interface InterfLeft {
    public static final int x = 0;

    public abstract void m1();

    public abstract void m2();

}


interface InterfRight {
    public abstract void m1(int i);

    public abstract void m2();

}

interface InterfCenter extends InterfLeft, InterfRight {
}

public class InterfaceDemo implements InterfLeft {
    public static void main(String[] args) {

    }

    @Override
    public void m1() {
        System.out.println("M1()");
    }

    @Override
    public void m2() {
        System.out.println("M2()");

    }
}
