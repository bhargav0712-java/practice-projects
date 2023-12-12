package com.practice.demo.service;


import com.practice.demo.entity.College;
import com.practice.demo.repo.CollegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class CollegeService {

    private CollegeRepo method1;
    @Autowired
    public CollegeService (CollegeRepo method1){
        this.method1 = method1;
    }

    public List<College> gellALLDetails(){
        return method1.findAll();
    }

    public College create ( College college){
        return method1.save(college);
    }
    public void update( College college){
        method1.save(college);

    }
    public void delete (Long studentId){
        method1.deleteById(studentId);
    }
}
