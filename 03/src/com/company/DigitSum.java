package com.company;

public class DigitSum {
    public static void main(String[] args) {

        System.out.println("Sum of the dits in num 125 is "+ sumDigit(1253));


    }

    public static int sumDigit(int  number ){

        if (number < 10){
            return -1;
        }
        int sumOfAllDigit =0;

        // 125--> 125/10 =12---> 12*10=120--> 125-120=5
        while(number > 0){
            //extract the lest significant digit
            int digit = number % 10;
            sumOfAllDigit +=digit;

            number /= 10;


        }
        return sumOfAllDigit;


    }
}
