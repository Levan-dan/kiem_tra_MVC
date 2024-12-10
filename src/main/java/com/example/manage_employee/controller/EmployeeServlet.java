package com.example.manage_employee.controller;

import com.example.manage_employee.model.Employee;
import com.example.manage_employee.service.EmployeeService;
import com.example.manage_employee.service.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "employeeServlet", urlPatterns = "/employee")

public class EmployeeServlet extends HttpServlet {
    public EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            default:
                break;
        }

    }

    public void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt( request.getParameter("ma"));
        String ten = request.getParameter("hoTen");
        int tuoi = Integer.parseInt( request.getParameter("tuoi"));
        String viTri = request.getParameter("viTri");
        String phongBan = request.getParameter("phongBan");
        double luong = Double.parseDouble(request.getParameter("luong"));

        Employee employee = new Employee(id, ten, tuoi, viTri, phongBan, luong);
        this.employeeService.save(employee);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("create.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action) {
            default:
                showListEmployee(request, response);
                break;
        }

    }

    public void showListEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = this.employeeService.findAll();
        request.setAttribute("employees", employees);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
        requestDispatcher.forward(request, response);
    }



}


