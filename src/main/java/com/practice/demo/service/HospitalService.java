package com.practice.demo.service;


import com.practice.demo.entity.Hospital;
import com.practice.demo.repo.HopsitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    private HopsitalRepo method1;

    @Autowired
    public HospitalService (HopsitalRepo method1){
        this.method1 = method1;
    }

    public List<Hospital> doctorList(){
        return method1.findAll();
    }
    public Hospital createDr( Hospital hospital){

        return method1.save(hospital);
    }
    public Hospital updateDR( String name , Hospital hospital){
        if (method1.existsById(name)){
            hospital.setName(name);
            return method1.save(hospital);
        }
        return null;

    }

    public void deleteRecord (String name){

        method1.deleteById(name);
    }


}
