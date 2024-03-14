package com.kpit.demo14;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.demo14.Layer2.FixedDepositAccount;
import com.kpit.demo14.Layer4.FixedDepositAccountService;

@SpringBootTest
public class FixedDepositeAccountServiceTest {
    @Autowired
    FixedDepositAccountService fixedDepositAccountService;
    @Test
    public void addAccountTest() {
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(1, "Ram", 20000);
        fixedDepositAccountService.addAccount(fixedDepositAccount);
    }

    @Test
    public void getAllAccounts() {
        List<FixedDepositAccount> fixedDepositAccounts = fixedDepositAccountService.getAllAccounts();
        for (FixedDepositAccount fixedDepositAccount : fixedDepositAccounts) {
            System.out.println(" Account: " + fixedDepositAccount);
        }
    }

    @Test
    public void getAccount() {
        FixedDepositAccount fixedDepositAccount = fixedDepositAccountService.getAccount(1);
        System.out.println("Account:" + fixedDepositAccount);
    }

    @Test
    public void deleteAccount() {
        fixedDepositAccountService.deleteAccount(1);
    }

    @Test
    public void updateAccount() {
    FixedDepositAccount fixedDepositAccount  = new FixedDepositAccount(102, "Ra", 25000);
        System.out.println("Account:" + fixedDepositAccount);
    }
    }
    
