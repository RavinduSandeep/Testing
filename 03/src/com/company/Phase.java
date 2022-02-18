package com.company;

import java.util.Scanner;

public class Phase {
    public static void main(String[] args) {

        String stringNumber = "2019";
        System.out.println("String Number = "+ stringNumber);

        //int number = Integer.parseInt(stringNumber);
        double number = Double.parseDouble(stringNumber);
        System.out.println("Number = "+ number);

        stringNumber += 1;
        number += 1 ;

        System.out.println("String Number = "+ stringNumber);
        System.out.println("Number = "+ number);

        ///// scanner 88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth = ");


        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int dateOfBirth = scanner.nextInt();
            scanner.nextLine();

            int age = 2022 - dateOfBirth;

            System.out.println("Enter Your Name = ");
            String name = scanner.nextLine();

            if (age > 0 && age < 100){
                System.out.println("Your name is "+ name + " and you are "+age+ " years old.");
            } else {
                System.out.println("Invalid age.");
            }
        }else {
            System.out.println("Unable to phase the date of birth.");
        }

        scanner.close();

    }

}
