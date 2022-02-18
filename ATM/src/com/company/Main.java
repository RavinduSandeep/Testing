package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount sadinisBankAccount = new BankAccount(10000,"Sadini Chamika",1234567,1234);
        BankAccount thisarasBankAccount = new BankAccount(15000,"Thisara kavinda",1234568,4567);

        Scanner scanner = new Scanner(System.in);

        boolean isAvailable = true;
        while (isAvailable){

        System.out.println("ATM \n");
        System.out.println("1.Enter your Card :");
        System.out.println("2. Card less transaction :");

        int enterCard = scanner.nextInt();
        if (enterCard == 1){
            System.out.println("1.Enter your PIN number to proceed:");
            int pinNumber = scanner.nextInt();

            if (pinNumber == sadinisBankAccount.getAtmPin() || pinNumber == thisarasBankAccount.getAtmPin()){
                System.out.println("1. Cash Deposit");
                System.out.println("2. Cash Withdrawal");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                int input1 = scanner.nextInt();

                switch (input1){
                    case 1:
                        System.out.println("-- Cash Deposit --");
                        System.out.println("Enter the amount to deposit:");
                        double deposit = scanner.nextDouble();
                        if (pinNumber== sadinisBankAccount.getAtmPin()){
                            sadinisBankAccount.deposit(deposit);
                        }else {
                            thisarasBankAccount.deposit(deposit);
                        }

                    case 2:
                        System.out.println("-- Cash Withdrawal --");
                        System.out.println("Enter the amount to withdraw:");
                        double withdraw = scanner.nextDouble();
                        if (pinNumber== sadinisBankAccount.getAtmPin()){
                            sadinisBankAccount.withdrawal(withdraw);
                        }else {
                            thisarasBankAccount.withdrawal(withdraw);
                        }

                }


            }else {
                System.out.println("Enter Valid Input To Proceed.");
            }


        }else if ( enterCard == 2) {
            System.out.println("Enter number 1");
        }else{
            System.out.println("Enter Valid Input To Proceed.");
            scanner.nextLine();
        }
break;

        }
    }
}
