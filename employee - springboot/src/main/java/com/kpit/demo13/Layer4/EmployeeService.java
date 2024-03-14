package com.kpit.demo13.Layer4;

import java.util.List;

import com.kpit.demo13.Layer2.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee obj);
    Employee updatEmployee(int id,Employee updateobj);
    void deleteEmployee(int id);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
}
