package com.practice.demo.controller;


import com.practice.demo.entity.Wipro;
import com.practice.demo.service.WipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wipro")
public class WipController {
    private WipService wiproMethod2;

    @Autowired
    public WipController ( WipService wiproMethod2){

        this.wiproMethod2 = wiproMethod2;
    }

    @GetMapping("/list")
    public List<Wipro> allEmp(){
        return wiproMethod2.getAllEmp();

    }
    @PostMapping("/create")
    public Wipro createEmp(@RequestBody Wipro wipro){

        return wiproMethod2.createEmp(wipro);
    }
    @PutMapping("/{id}")
    public Wipro updateEmp(@PathVariable Long id, @RequestBody Wipro wipro){
        return wiproMethod2.updateEmp(id, wipro);
    }

    @DeleteMapping("/{id}")
    public void deleteEmp( @PathVariable Long id){

        wiproMethod2.deleteEmp(id);
    }
}
