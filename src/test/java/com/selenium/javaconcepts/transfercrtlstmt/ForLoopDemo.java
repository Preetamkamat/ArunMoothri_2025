package com.selenium.javaconcepts.transfercrtlstmt;

public class ForLoopDemo {
    public static void main(String[] args) {

        //continue flow
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i); //1, 2, 4, 5
        }

        //break flow
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);//1 ,2
        }
    }
}
