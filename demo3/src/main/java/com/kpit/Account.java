package com.kpit;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance; 
    public Account() {
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountNumber(int accountNumber) {
        System.out.println("setting the setAccountNumber");
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder) {
        System.out.println("setting the account holder name");
        this.accountHolder = accountHolder;
    }
    public void setAccountBalance(double accountBalance) {
        System.out.println("setting the account balance");
        this.accountBalance = accountBalance;
    }
    
}
