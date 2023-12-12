package com.practice.demo.service;

import com.practice.demo.entity.Worker;
import com.practice.demo.repo.WorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WorkerService {
    private WorkerRepo path1;

    @Autowired
    public WorkerService (WorkerRepo path1){
        this.path1= path1;
    }
    public List<Worker> listFolks(){
        return path1.findAll();
    }

    public Optional<Worker> listByID(Long id) {
        return path1.findById(id);
    }
    public Worker create ( Worker worker){
        return path1.save(worker);
    }
    public void update ( Worker worker){
         path1.save(worker);
    }

    public void delete(Long id){
        path1.deleteById(id);
    }



}
