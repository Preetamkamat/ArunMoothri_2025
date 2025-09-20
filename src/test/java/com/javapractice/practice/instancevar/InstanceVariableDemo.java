package com.javapractice.practice.instancevar;

public class InstanceVariableDemo {

    /*
    Separate copy will be created with object creation for instance variables.
    Static area cannot access the instance area
    For instance variables , we are not  required to perform initialization explicitly,
    JVM will provide default values.
    final variable will be initialized the variable we need to provide initialize(int x= 0) explicitly
     */
    final static int x = 0;

    /*   {
           //    x = 0;
       }

       InstanceVariableDemo() {
   //        x = 0;
       }
   */
    public static void main(String[] args) {
        InstanceVariableDemo i = new InstanceVariableDemo();
        System.out.println(x);
    }
}
