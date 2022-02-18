package com.company;

public class SpeedConverter {


    public static void main(String[] args) {

       printConversion(12);

    }

    public static long toMilesPerHour(double kilometerPerHour){

        if (kilometerPerHour < 0){
            return -1;
        }
            long milesPerHour = Math.round(kilometerPerHour/1.609);
            return milesPerHour;
    }

    public static void printConversion ( double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println(" Invalid number");
        }else {
           // double milesPerHour = kilometersPerHour * 1.609d;
            long milesPerHour = toMilesPerHour(100);
            System.out.println(kilometersPerHour + " km/h" + " = " + milesPerHour + " mi/h");
        }
    }
}
