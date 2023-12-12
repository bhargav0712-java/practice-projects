package com.practice.demo.service;


import com.practice.demo.entity.VechicleInfo;

import com.practice.demo.repo.VechicleInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VechicleInfoService {
 @Autowired
  private VechicleInfoRepo vechicleDetailsRepo;

//    public VechicleInfoService(VechicleInfoRepo vechicleDetails) {
//        this.vechicleDetails = vechicleDetails;
//    }
    public List<VechicleInfo> allVechicles(){
        return vechicleDetailsRepo.findAll();}
//     public VechicleInfo oneVechicle(){ return vechicleDetailsRepo.findByVehicleNo(String vehicleNo) ;}

//
}


