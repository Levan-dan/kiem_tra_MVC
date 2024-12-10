package com.example.manage_employee.service;

import com.example.manage_employee.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private static Map<Integer, Employee> employees;

    static {
        employees = new HashMap<>();
    }


    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public void save(Employee employee) {
        employees.put(employee.getMaNhanVien(), employee);
    }
}
