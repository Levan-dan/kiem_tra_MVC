package com.example.manage_employee.service;

import com.example.manage_employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

}
