package com.practice.demo.controller;

import com.practice.demo.entity.Worker;
import com.practice.demo.service.WorkerService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    private WorkerService path2;

    public WorkerController (WorkerService path2){
        this.path2 = path2;
    }

    @GetMapping
    public List<Worker> allList(){
        return path2.listFolks();
    }

    @GetMapping("/{id}")
    public Optional<Worker> listById (@PathVariable Long id){
        return path2.listByID(id);
    }

    @PostMapping
    public Worker createNew(@RequestBody Worker worker){
        return path2.create(worker);
    }
    @PutMapping("/{id}")
    public void updateOld(@PathVariable Long id, @RequestBody Worker worker){
       worker.setId(id);
       path2.update(worker);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        path2.delete(id);
    }
}
