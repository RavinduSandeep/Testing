package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int myFirstNumber = (10+5)+(2*10) ;
        int mySecondNumber = 12 ;
        int myThirdNumber = 6 ;
        int myTotal = myFirstNumber+ mySecondNumber+ myThirdNumber;
        int myLastOne =1000 - myTotal ;
        System.out.println("Total:" + myLastOne);

        long myLongValue = 100L;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Max Value:" + myLongMaxValue);
        System.out.println("Long Min Value :" + myLongMinValue);

        short myshortMinValue = Short.MIN_VALUE;
        short myshortMaxValue = Short.MAX_VALUE;
        System.out.println("short Max Value:" + myshortMaxValue);
        System.out.println("short Min Value :" + myshortMinValue);

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("byte Max Value:" + myByteMaxValue);
        System.out.println("byte Min Value :" + myByteMinValue);

        byte myByte = 2;
        short myShort = 50;
        int myInt = 100;

        long myLong = 5000L + 10*( myShort + myByte + myInt );
        System.out.println("My long value :"+  myLong);

        // Casting
         int int01 = 5;
         double double01 =2.25;
         short short01 = 2345;
         long long01 = 81628;

        int casting =(int) (int01+ double01 + short01 + long01);

        System.out.println("Example Casting  = "  + casting);

        //Double and float

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My min Float Value:" + myMinFloatValue);
        System.out.println("My max Float Value :"+ myMaxFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double MyMinDoubleValue = Double.MIN_VALUE;
        System.out.println("My Max Double Value :" + myMaxDoubleValue);
        System.out.println("My Min Double Value :"+ myMaxDoubleValue);

        int myIntValue = 5;
        double myDoubleValue = 5.25d;
        float myFloatValue = 5.25f;

        double Total = (myIntValue + myDoubleValue + myFloatValue);
        System.out.println("Total =" + Total);

        // boolean and char

        char myCharValue= 'A';
        char myUnicodeCharValue = '\u00A9';
        System.out.println(myCharValue);
        System.out.println(myUnicodeCharValue);


        //String

        String myString = "This is my String";
        System.out.println("This is my String 01 :"+ myString );



        //operators + - * / ++ --

        int result = 10;
        result = result* 10;
        System.out.println("Result = "+ result);

        result ++;
        System.out.println("++ :" + result);

        result--;
        System.out.println("-- "+ result);

        result += 10;
        System.out.println("Result + 10 =" +result);

        result *= 10;
        System.out.println("Result * 10 "+result);

        result -= 2;
        System.out.println("Result - 2 " +result);


        //if


        boolean isAlean = false;
        if (isAlean == false)
            System.out.println("Is not Alean");
        else
            System.out.println("Is Alean");


        // challenge

        double myDouble01 =20.00;
        double myDouble02 = 80.00;
        double Total1n2 = 100.00 *(myDouble01 + myDouble02);
        System.out.println("Total of two Numbers :" +Total1n2);
        double newTotal = Total1n2 % 100.00;
        System.out.println("Remainder :"+ newTotal);

        boolean remainder =(newTotal) == 0 ? true:false;

        if ((remainder == true)){;
            System.out.println("Got remainders");
        }



    }
}
