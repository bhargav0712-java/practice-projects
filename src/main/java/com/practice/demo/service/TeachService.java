package com.practice.demo.service;

import com.practice.demo.entity.Teachers;
import com.practice.demo.repo.TeachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TeachService {
@Autowired
    private TeachRepo teachDetails;

    public TeachService (TeachRepo teacher){
        this.teachDetails= teacher;
    }
    public List<Teachers>  allTeacherDetails(){

        return teachDetails.findAll();
    }

    public Teachers addTeacher(Teachers teacher) {
        return teachDetails.save(teacher);
    }

}
