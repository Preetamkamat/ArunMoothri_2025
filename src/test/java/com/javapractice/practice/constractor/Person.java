package com.javapractice.practice.constractor;

import org.openqa.selenium.chrome.ChromeDriver;

public class Person {
    String name;
    int rollNo;

    Person(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Student extends Person {

    String college;

    Student(String name, String college, int rollNo) {
        super(name, rollNo);
        this.college = college;
    }

    public static void main(String[] args) {
        Student s = new Student("Preetam", "Bharati", 101);

    }
}