package com.practice.demo.controller;

import com.practice.demo.dto.InfosysDto;
import com.practice.demo.entity.Infosys;
import com.practice.demo.service.InfosysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("infosys")
public class InfosysController {

    private InfosysService infosysService;
    @Autowired
    public InfosysController(InfosysService infosysService){
        this.infosysService = infosysService;
    }

    @PostMapping("/create")
    public Infosys createNew(@RequestBody Infosys infosys){
        return infosysService.createNew(infosys);
    }

    @GetMapping("/vacancy")
    public List<Infosys> allPosts(){
        return infosysService.getAllList();
    }

    @GetMapping("/vacancy{id}")
    public Optional<Infosys> displayById(@PathVariable Long id, @RequestBody Infosys infosys){
        return infosysService.ListById(id);
    }

    @PutMapping("/{id}")
    public Infosys updateThePost(@PathVariable Long id, @RequestBody Infosys infosys){
        return infosysService.updateExisting(id, infosys);
    }

    @DeleteMapping("/{id}")
    public void deletePost(Long id){
        infosysService.deletePost(id);
    }

    @GetMapping("/image")
        public List<InfosysDto> getAllList(){
            return infosysService.getAllDetails();
        }
    }

