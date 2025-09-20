package com.javapractice.javaarun.classandobject.one;

public class Demo {
    public static void main(String[] args) {
        ClassConceptCar c /*object reference*/ = new ClassConceptCar();
        c.company = "Tata Motors";
        c.carModel = "Punch";
        c.colors = "Orange";
        c.mileage = 20.5d;
        c.wheels = 4;
        c.startCar();
        c.stopCar();
        c.carDetails();
    }
}
