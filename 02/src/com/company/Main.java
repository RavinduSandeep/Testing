package com.company;

public class Main {

    public static void main(String[] args) {

        // challenge
        boolean gameOver = true;
        int score =10000;
        int levelCompleted = 8;
        int bonus = 200;

//        if (gameOver==true){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was : "+ finalScore );

      //  calculateScore(gameOver,score,levelCompleted,bonus);

// ************************* 01

        int HighScorePosition = calculateTheHighScorePosition(1500);
        displayHighScorePosition("Ravindu",HighScorePosition);

        HighScorePosition = calculateTheHighScorePosition(900);
        displayHighScorePosition("Sandeep",HighScorePosition);

        HighScorePosition = calculateTheHighScorePosition(400);
        displayHighScorePosition("Raviz",HighScorePosition);

        HighScorePosition = calculateTheHighScorePosition(50);
        displayHighScorePosition("San",HighScorePosition);

//************************* 02

            checkNumber(10);
            checkNumber(0);
            checkNumber(-1);

            SpeedConverter.printConversion(22.45);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){

        if (gameOver==true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was : " + finalScore);
            return finalScore;
        }else
            return -1;


    }


    // method
    //************************* 01

    public static void displayHighScorePosition (String playerName, int positionInTheHighScoreTable){
        System.out.println(playerName+ " managed to get into position "+ positionInTheHighScoreTable + " on the high score table.");
    }

    public static int calculateTheHighScorePosition (int playerScore){
        if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500 ){
            return 2;
        }else if (playerScore >= 100 ){
            return 3;
        }
            return 4;

    }
//************************* 02
    public static void checkNumber (double number){

        if (number > 0){
            System.out.println("Positive Number");
        }else if (number < 0){
            System.out.println("Negative Number");
        }else
            System.out.println("Zero");
    }
}





