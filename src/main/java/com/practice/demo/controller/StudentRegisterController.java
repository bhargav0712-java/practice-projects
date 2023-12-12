package com.practice.demo.controller;

import com.practice.demo.entity.StudentRegister;
import com.practice.demo.service.StudentRegisterService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/studentinfo")
public class StudentRegisterController {
    @Autowired
    private StudentRegisterService studentService;


    @GetMapping("/all")
    public List<StudentRegister> getAllStudentRegiter() {
      return studentService.allStudentRegister();
//        List<StudentRegister> studentRegisterList = studentService.allStudentRegister();
//        return  studentRegisterList;
   }
}
