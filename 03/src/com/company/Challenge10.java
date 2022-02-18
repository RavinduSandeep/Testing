package com.company;

public class Challenge10 {

    public static void main(String[] args) {
//        int num = 4;
//        int finalNum = 20;
//
//        while (num <= finalNum) {
//            num++;
//            if (!isEvenNumber(num)) {
//                continue;
//            }
//            System.out.println("Even Number = " + num);
//        }

        int num = 4;
        int finalNum = 20;
        int evenNumberFound=0;
        int sum = 0;


        while (num <= finalNum) {
            num++;
            if (!isEvenNumber(num)) {
                continue;
            }
            System.out.println("Even Number = " + num);
            sum += num;
            evenNumberFound++;
            if (evenNumberFound >= 5){
                break;
            }

        }
        System.out.println("Total "+ sum);
        System.out.println("Total Even Number found "+ evenNumberFound);

    }

    public static boolean isEvenNumber(int num) {

        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}



