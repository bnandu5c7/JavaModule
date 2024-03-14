package com.kpit.demo14.Layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo14.Layer2.FixedDepositAccount;
@Repository
public interface FixedDepositAccountRepository extends CrudRepository<FixedDepositAccount,Integer> {
    FixedDepositAccount findById(int id);
    List<FixedDepositAccount> findAll();
    
}
