package com.javapractice.javaarun.constructors.two;

public class Car {
    String company;
    String carModel;
    String colors;
    double mileage;
    int wheels;

    public Car(String com, String mod, String col, int whe, double mil) {
        company = com;
        carModel = mod;
        colors = col;
        wheels = whe;
        mileage = mil;


    }

    public void startCar() {
        System.out.println("Car from " + company + " and model " + carModel + " stared");
    }

    public void stopCar() {
        System.out.println("Car from " + company + " and model" + carModel + " stopped");
    }

    public void carDetails() {
        System.out.println(" Company of the car is " + company);
        System.out.println(" Model of the car is " + carModel);
        System.out.println(" color of the car is " + colors);
        System.out.println(" Mileage of the car is " + mileage);
        System.out.println(" No. of the car is " + wheels);
        System.out.println("-------------------------------------");
    }
}
