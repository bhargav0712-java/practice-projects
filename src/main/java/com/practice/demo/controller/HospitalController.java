package com.practice.demo.controller;

import com.practice.demo.entity.Hospital;
import com.practice.demo.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DoctorDetails")
public class HospitalController {

    private HospitalService method2;

    @Autowired
    public HospitalController (HospitalService method2){
        this.method2 = method2;
    }

    @GetMapping("/list")
    public List<Hospital> drlist(){
        return
                method2.doctorList();
    }

    @PostMapping
    public Hospital createDrList(@RequestBody Hospital hospital){
    return method2.createDr(hospital);
    }

    @PutMapping ("/{name}")
    public Hospital updateDrList(@PathVariable String name , @RequestBody Hospital hospital) {
        return  method2.updateDR( name , hospital);
    }
    @DeleteMapping("/{name}")
    public void delBook(@PathVariable String name){
        method2.deleteRecord(name);
    }
}

