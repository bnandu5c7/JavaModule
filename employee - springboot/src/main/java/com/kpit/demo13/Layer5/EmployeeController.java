package com.kpit.demo13.Layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo13.Layer2.Employee;
import com.kpit.demo13.Layer4.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService empservice;
    @PostMapping("/addEmp")
     public Employee addEmployee(@RequestBody Employee e) {
       return empservice.addEmployee(e);
    }
    @PutMapping("/modify/{id}")
    public Employee updatEmployee(@PathVariable int id, @RequestBody Employee updateobj) {
       
        return empservice.updatEmployee(id,updateobj);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        empservice.deleteEmployee(id);
    }
    @GetMapping("/display/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return empservice.getEmployee(id);
     }
     @GetMapping("/displayAll")
      public List<Employee> getAllEmployees() {
        return empservice.getAllEmployees();

    }
    
}
