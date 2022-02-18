package com.company;

public class FinalChallenge {

    public static final String INVALID_VALUE_MESSAGE ="Invalid Message";


    public static void main(String[] args) {

        System.out.println(getDurationString(826000));

    }

    public static String getDurationString(int minuets, int seconds){

        if ((minuets < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int remainingMinutes = minuets % 60;
        int hours = minuets / 60;

        int date = hours / 24;
        int remainingHours = hours % 24;

        String dateString = date + "d";
        if(date < 10){
            dateString = "0"+ dateString;
        }

        String hoursString = remainingHours + "h";
        if(remainingHours < 10){
            hoursString = "0"+ hoursString;
        }

        String minuteString = remainingMinutes + "m";
        if(remainingMinutes < 10){
            minuteString = "0"+ minuteString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10){
            secondsString = "0"+ secondsString;
        }


        return dateString +" " +hoursString +" "+ minuteString+ " "+ secondsString;
    }

    public static String getDurationString(int seconds){

        if (seconds < 0 ){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingMinutes = seconds % 60 ;

        return getDurationString(minutes,remainingMinutes);
    }
}
