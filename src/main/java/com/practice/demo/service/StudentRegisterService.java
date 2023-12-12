package com.practice.demo.service;


import com.practice.demo.entity.StudentRegister;
import com.practice.demo.repo.StudentRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentRegisterService {
    @Autowired
    private StudentRegisterRepo studentRepo;

    public StudentRegisterService(StudentRegisterRepo studentRepo) {

        this.studentRepo = studentRepo;
    }

    public List<StudentRegister> allStudentRegister() {

//        List<StudentRegister>  students = studentRepo.findAll();

//        return students;

        List<StudentRegister> students;
        students = studentRepo.findAll();
        return students;

//        var students = studentRepo.findAll();
    }
}