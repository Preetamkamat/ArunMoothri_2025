package com.javapractice.javaarun.classandobject.two;

public class Demo {
    public static void main(String[] args) {
        Car tata /*object reference*/ = new Car("Tata Motors", "Punch", "Orange", 4, 20.5d);
        tata.startCar();
        tata.stopCar();
        tata.carDetails();
        Car marutiSuzuki = new Car("Maruti Suzuki", "Swift", "White", 4, 22.5d);
        marutiSuzuki.startCar();
        marutiSuzuki.startCar();
        marutiSuzuki.carDetails();
    }

}
