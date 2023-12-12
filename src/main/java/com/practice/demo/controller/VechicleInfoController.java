package com.practice.demo.controller;

import com.practice.demo.entity.StudentRegister;
import com.practice.demo.entity.VechicleInfo;
import com.practice.demo.service.VechicleInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vechicledetails")
public class VechicleInfoController {
    @Autowired
    private VechicleInfoService vechicleService;

    @GetMapping("/all")
    public List<VechicleInfo> getAllVechilcInfo(){

        return  vechicleService.allVechicles();
    }
    @GetMapping("/me")
    public String getmeVechilcInfo(){

        return  " hi my name is bhargav";
    }

}
