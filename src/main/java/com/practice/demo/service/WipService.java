package com.practice.demo.service;

import com.practice.demo.entity.Wipro;
import com.practice.demo.repo.WipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class WipService {

    private WipRepo wiproMethod1;
    @Autowired
    public WipService ( WipRepo wiproMethod1){

        this.wiproMethod1 = wiproMethod1;
    }

    // GET
    public List<Wipro> getAllEmp(){
        return wiproMethod1.findAll();
    }

    // To add new
    public Wipro createEmp( Wipro wipro) {

        return wiproMethod1.save(wipro);
    }
    //post to update
    public Wipro updateEmp(Long id, Wipro wipro){
        if ( wiproMethod1.existsById(id)){
            wipro.setId(id);
            return  wiproMethod1.save(wipro);
        }
        return null;
    }

    public void deleteEmp(long id){
        wiproMethod1.deleteById(id);
    }


}
