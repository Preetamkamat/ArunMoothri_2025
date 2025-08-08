package com.javapractice;

public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        String s = "Automation";
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        System.out.println("Length of the String: " + length);
    }

}
