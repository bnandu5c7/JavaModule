package com.kpit.demo14.Layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo14.Layer2.FixedDepositAccount;
import com.kpit.demo14.Layer3.FixedDepositAccountRepository;

@Service
public class FixedDepositAccountServiceImpl implements FixedDepositAccountService{
    @Autowired
    FixedDepositAccountRepository accrepo;

    @Override
    public FixedDepositAccount addAccount(FixedDepositAccount obj) {
     return accrepo.save(obj);
    }

    @Override
    public FixedDepositAccount updateAccount(int id, FixedDepositAccount updateObj) {
       FixedDepositAccount accObj = accrepo.findById(id);
       if(updateObj.getAccountHolder()!=null)
       {
        accObj.setAccountHolder(updateObj.getAccountHolder());
       }
       if(updateObj.getAccountBalance()!=0)
       {
        accObj.setAccountBalance(updateObj.getAccountBalance());
       }
       return accrepo.save(accObj);
    }

    @Override
    public void deleteAccount(int id) {
        accrepo.deleteById(id);
    }

    @Override
    public FixedDepositAccount getAccount(int id) {
       return accrepo.findById(id);
    }

    @Override
    public List<FixedDepositAccount> getAllAccounts() {
        return accrepo.findAll();
    }
    
}
