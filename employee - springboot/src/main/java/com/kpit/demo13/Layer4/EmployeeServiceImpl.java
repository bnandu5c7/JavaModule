package com.kpit.demo13.Layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo13.Layer2.Employee;
import com.kpit.demo13.Layer3.EmployeeRepository;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
  @Autowired
   EmployeeRepository empRepo;
    @Override
    public Employee addEmployee(Employee e) {
       return empRepo.save(e);
    }
    @Override
    public Employee updatEmployee(int id, Employee updateobj) {
      Employee emp =empRepo.findById(id);
      if(updateobj.getEname()!=null)
      {
        emp.setEname(updateobj.getEname());
      }
      if(updateobj.getEsalary()!=0.0)
      {
        emp.setEsalary(updateobj.getEsalary());
      }
      return empRepo.save(emp);
    }
    @Override
    public void deleteEmployee(int id) {
        empRepo.deleteById(id);
    }
    @Override
    public Employee getEmployee(int id) {
       return empRepo.findById(id);
    }
    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }
    
}
