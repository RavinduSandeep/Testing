package com.company;

public class MethodOverloading {

    ///////// method overloading/////////

    public static void main(String[] args) {
//        int newScore =calculateScore("Ravindu",1000);
//        System.out.println("New score is : "+ newScore);


        calcFeetAndInchesToCentimeter(23);
    }
//
//    public static  int calculateScore (String playerName, int score){
//        System.out.println("Player "+ playerName+" scored "+ score + " points.");
//        return score*1000;
//    }

    public static double calcFeetAndInchesToCentimeter( double feet, double inches){

        if((feet < 0) || (inches < 0)  || (inches >= 12)){
            System.out.println("invalid feet or inches.");
            return -1;
        }
        double centimeter = (feet * 12) * 2.54 ;
        centimeter += inches * 2.54;
        System.out.println(feet +" Feet, "+ inches + " inches = "+ centimeter + " cm.");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeter(double inches){
        if (inches <0 ){
            System.out.println("invalid parameter");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.println(inches + " inches = "+ feet+ " feet and "+ remainderInches+ " inches");
        return calcFeetAndInchesToCentimeter(feet, remainderInches);
    }
}

