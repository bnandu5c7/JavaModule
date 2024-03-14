package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


    @Entity
    @Table(name ="accnt_tbl")
 public class Account {
    @Id
    @Column(name ="acctNo")
    private int acctNo ;
    @Column(name ="acctHolderName")
    private String acctHolderName;
    @Column(name ="acctBalance")
    private double acctBalance;
    public int getAcctNo() {
        return acctNo;
    }
    public String getAcctHolderName() {
        return acctHolderName;
    }
    public double getAcctBalance() {
        return acctBalance;
    }
    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }
    public void setAcctHolderName(String acctHolderName) {
        this.acctHolderName = acctHolderName;
    }
    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }
    

    
}
