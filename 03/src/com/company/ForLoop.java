package com.company;

public class ForLoop {
    public static void main(String[] args) {


        for (int i=2; i <=7; i++ ) {
            System.out.println("10000 at " + i + " % interest = " + String.format ("%.2f",interestRate(10000,i)));
        }
        System.out.println("***************************");

        for (int i=8; i >=2; i-- ) {
            System.out.println("10000 at " + i + " % interest = " + String.format ("%.2f",interestRate(10000,i)));
        }

    }

    public static double interestRate (double amount, double interest){
            return  (amount * (interest/100));

    }

}
