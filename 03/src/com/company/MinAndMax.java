package com.company;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean first = true;

        while (true) {
            System.out.println("Enter the Number :");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + " Max = " + max);
        scanner.close();
    }
}
