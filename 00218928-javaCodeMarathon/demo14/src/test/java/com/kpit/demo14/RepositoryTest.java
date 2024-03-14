package com.kpit.demo14;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kpit.demo14.Layer2.FixedDepositAccount;
import com.kpit.demo14.Layer3.FixedDepositAccountRepository;
@SpringBootTest
public class RepositoryTest {
   
    @Autowired
    FixedDepositAccountRepository fixedDepositAccountRepository;

    @Test
    public void addAccount() {
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(4, "Gita", 70000);
        fixedDepositAccountRepository.save(fixedDepositAccount);
    }

    @Test
    public void getAllAccounts() {
        List<FixedDepositAccount> fixedDepositAccounts = fixedDepositAccountRepository.findAll();
        for (FixedDepositAccount fixedDepositAccount : fixedDepositAccounts) {
            System.out.println(" Account: " + fixedDepositAccount);
        }
    }

    @Test
    public void getAccount() {
        FixedDepositAccount fixedDepositAccount = fixedDepositAccountRepository.findById(1);
        System.out.println("Account:" + fixedDepositAccount);
    }

    @Test  
     public void deleteAccount() {
        fixedDepositAccountRepository.deleteById(1);
    }

}

