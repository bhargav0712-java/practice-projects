package com.practice.demo.service;


import com.practice.demo.entity.Employee;
import com.practice.demo.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService  {
    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;

    }
    public List<Employee>  allEmployee() {
        return employeeRepo.findAll();
    }   
}
