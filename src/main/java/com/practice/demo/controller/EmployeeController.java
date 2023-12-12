package com.practice.demo.controller;


import com.practice.demo.entity.Employee;
import com.practice.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    @RequestMapping("/employees")
    public class EmployeeController {
        @Autowired
        private EmployeeService employeeService;

        // Define RESTful endpoints here

//    @GetMapping("/all")
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployees();
////    }
//    @GetMapping("/me")
//    public String getmeEmployees() {
//        return " hi bhargav ";
    }


