package com.company;

import java.util.Scanner;

public class UserInputReadingChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        int sum = 0;
        int count = 0;

        while (true) {
            int order = count+1;
            System.out.println("Enter your Number #" + order  + " :");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                if (count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number.");
            }
            scanner.nextLine();
        }


        System.out.println("Sum of the all 10 numbers are = " + sum);
        scanner.close();

    }


}
