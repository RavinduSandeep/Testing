package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount (int accountNumber,double balance, String customerName, String email, int phoneNumber){
        this.accountNumber= accountNumber;
        this.balance= balance;
        this.customerName= customerName;
        this.email= email;
        this.phoneNumber= phoneNumber;
    }

    public void deposit (double depositAmount){
        this.balance +=depositAmount;
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

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
