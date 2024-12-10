package com.example.manage_employee.controller;

import com.example.manage_employee.service.EmployeeService;
import com.example.manage_employee.service.EmployeeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "employeeServlet", urlPatterns = "/employee")

public class EmployeeServlet extends HttpServlet {
    private final EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }

}
