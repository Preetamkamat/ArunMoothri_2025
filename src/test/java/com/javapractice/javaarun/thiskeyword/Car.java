package com.javapractice.javaarun.thiskeyword;

public class Car {
    String company;
    String carModel;
    String colors;
    double mileage;
    int wheels;

    public Car(String company, String carModel, String colors, int wheels, double mileage) {
        this.company = company;
        this.carModel = carModel;
        this.colors = colors;
        this.wheels = wheels;
        this.mileage = mileage;
    }

    public void startCar() {
        System.out.println("Car from " + company + "and model " + carModel + "stared");
    }

    public void stopCar() {
        System.out.println("Car from " + company + "and model" + carModel + "stopped");
    }

    public void carDetails() {
        System.out.println("Company of the car is " + company);
        System.out.println("Model of the car is " + carModel);
        System.out.println("color of the car is " + colors);
        System.out.println("Mileage of the car is " + mileage);
        System.out.println("No. of the car is " + wheels);
        System.out.println("-------------------------------------");
    }
}
