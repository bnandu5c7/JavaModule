package com.kpit.demo14.Layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FixedDepositAccount")
public class FixedDepositAccount {
    @Id
    @Column(name="accountNumber")
    private int accountNumber;
    @Column(name="accountHolder")
    private String accountHolder;
    @Column(name="accountBalance")
    private int accountBalance;
    public FixedDepositAccount() {
    }
    public FixedDepositAccount(int accountNumber, String accountHolder, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public static void save(FixedDepositAccount obj) {
    }



}
