package com.kpit.demo14.Layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo14.Layer2.FixedDepositAccount;
import com.kpit.demo14.Layer4.FixedDepositAccountService;

@RestController
public class FixedDepositeAccountController {
   @Autowired
   FixedDepositAccountService accservice;
   @PostMapping("/add")
   public FixedDepositAccount addAccount(@RequestBody FixedDepositAccount obj) {
     return accservice.addAccount(obj);
    }
    @PutMapping("/modify/{id}")
    public FixedDepositAccount updateAccount(@PathVariable int id, @RequestBody FixedDepositAccount updateObj) 
    {
        return accservice.updateAccount(id,updateObj);
    }
    @DeleteMapping("/remove/{id}")
    public void deleteAccount( @PathVariable int id) {
        accservice.deleteAccount(id);
    }
    @GetMapping("/display/{id}")
    public FixedDepositAccount getAccount(@PathVariable int id) {
        return accservice.getAccount(id);
     }
     @GetMapping("/displayAll")
      public List<FixedDepositAccount> getAllAccounts() {
        return accservice.getAllAccounts();
    }   


    
    
}
