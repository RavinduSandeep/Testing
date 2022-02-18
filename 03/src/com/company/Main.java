package com.company;

public class Main {

    public static void main(String[] args) {



        int inputValue = 1;
        if (inputValue ==1 ){
            System.out.println("Input number is 1");
        }else if (inputValue ==2){
            System.out.println("Input numbers is 2");
        } else
            System.out.println("Input number is not 1 or 2");

        int inputNumber =12;
        switch (inputNumber) {
            case 1 :
                System.out.println("Input number is 1");
                break;

            case 2:
                System.out.println("Input number is 2 ");
                break;

            case 3: case 4: case 5:
                System.out.println("Input Number is "+ inputNumber);
                break;

            default:
                System.out.println("Not similar");
                break;
        }

        char newChar ='D';
         switch (newChar) {
             case 'A':
                 System.out.println("Input value is A ");
                 break;
             case 'B':
                 System.out.println("Input value is B");
                 break;
             case 'C':
                 System.out.println("Input value is C");
                 break;
             case 'D':
                 System.out.println("Input value is D ");
                 break;
             case 'E':
                 System.out.println("Input value is E");
                 break;
             default:
                 System.out.println("Not found any");
                 break;
         }

        char newChar2 ='C';
        switch (newChar2) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Input value is " + newChar2);
                break;

            default:
                System.out.println("Not found any");
                break;

        }

        String month = "january";
        switch (month.toLowerCase()){
            case "january": case "february ": case "march": case "april ":
                System.out.println(month.toUpperCase()+ " is the month");
                break;
            default:
                System.out.println("Not a month");
                break;
        }

    }


}
