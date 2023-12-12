package com.practice.demo.controller;

import com.practice.demo.entity.College;
import com.practice.demo.entity.Hospital;
import com.practice.demo.service.CollegeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/College")
public class CollegeController {
    private CollegeService method2;

    @Autowired
    public CollegeController(CollegeService method2) {
        this.method2 = method2;
    }

    @GetMapping
    public List<College> allDetails() {
        return method2.gellALLDetails();
    }

    @PostMapping("/create")
    public College createNew(@RequestBody College college) {
        return method2.create(college);
    }

    @PutMapping("/Update{studentId}")
    public void updatebyid(@PathVariable long studentId, @RequestBody College college) {
        college.setStudentId(studentId);
        method2.update(college);
    }

    @DeleteMapping("/delete{studentId}")
    public void delete( @PathVariable Long studentId){
        method2.delete(studentId);
    }
}


