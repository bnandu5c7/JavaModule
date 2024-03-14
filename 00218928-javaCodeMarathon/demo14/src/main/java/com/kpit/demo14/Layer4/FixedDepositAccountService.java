package com.kpit.demo14.Layer4;

import java.util.List;

import com.kpit.demo14.Layer2.FixedDepositAccount;

public interface FixedDepositAccountService {
    FixedDepositAccount addAccount(FixedDepositAccount obj);
    FixedDepositAccount updateAccount(int id,FixedDepositAccount updateObj);
    void deleteAccount(int id);
    FixedDepositAccount getAccount(int id);
    List<FixedDepositAccount> getAllAccounts();
        
}
