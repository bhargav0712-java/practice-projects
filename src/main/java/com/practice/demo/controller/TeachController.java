package com.practice.demo.controller;



import com.practice.demo.entity.Teachers;
import com.practice.demo.service.TeachService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/teacher")
public class TeachController {

    @Autowired
    private TeachService teachOne;

    @GetMapping("/all")
   public List<Teachers> getAllTeachers() {
        return teachOne.allTeacherDetails();

   }
    @PostMapping("/")
    public Teachers addTeacher(@RequestBody Teachers teacher) {
        return teachOne.addTeacher(teacher);
    }

    @GetMapping("/me")
    public String getAllTechers(){

        return  " hi my name is bhargav";
    }

}
