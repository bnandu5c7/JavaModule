package com.kpit.demo13.Layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo13.Layer2.Employee;
@Repository
public interface EmployeeRepository  extends CrudRepository<Employee,Integer>{
    Employee findById(int id);
    List<Employee> findAll();
}
