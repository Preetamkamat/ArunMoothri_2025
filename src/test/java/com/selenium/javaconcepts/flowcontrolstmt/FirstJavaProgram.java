package com.selenium.javaconcepts.flowcontrolstmt;

public class FirstJavaProgram {

    public static void main(String[] args) {
        //Flow Control Statements
        String foodItem = "Pasta";
        switch (foodItem) {
            case "Pasta":
                System.out.println("Pasta is available");
                break;
            case "Noodles":
                System.out.println("Pasta is available");
                break;
            default:
                System.out.println(foodItem + " is not available");
        }
    }
}
