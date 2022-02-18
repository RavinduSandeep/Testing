package com.company;

public class BankAccount {

    private double balance;
    private String bankAccountHolder;
    private int atmPin;
    private int accountNumber;

    public BankAccount(double balance, String bankAccountHolder, int accountNumber, int atmPin) {
        this.balance = balance;
        this.bankAccountHolder = bankAccountHolder;
        this.atmPin = atmPin;
        this.accountNumber = accountNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made. New balance is "+this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance -withdrawalAmount < 0){
            System.out.println("only "+ this.balance+ " available. Withdrawal not process.");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount+" processed.Remaining Balance = "+this.balance);
        }
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBankAccountHolder(String bankAccountHolder) {
        this.bankAccountHolder = bankAccountHolder;
    }

    public void setAtmPin(int atmPin) {
        this.atmPin = atmPin;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getBankAccountHolder() {
        return bankAccountHolder;
    }

    public int getAtmPin() {
        return atmPin;
    }


}
