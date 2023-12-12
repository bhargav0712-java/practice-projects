package com.practice.demo.controller;

import com.practice.demo.entity.PetStore;
import com.practice.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {

    private  PetService petService;
   @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping("/create")
    public PetStore createNew(@RequestBody PetStore petStore){
        return petService.createNew(petStore);
    }

    @GetMapping("/available")
    public List<PetStore> getAllList(){
        return petService.getAllList();
    }

    @GetMapping("/available/{id}")
    public Optional<PetStore> getById(@PathVariable Long id, @RequestBody PetStore petStore){
        return petService.listById(id);
    }
    @GetMapping("/available/petid/{id}")
    public Optional<PetStore> getByPetId(@PathVariable Long id){
        return petService.getByPetId(id);
    }

    @GetMapping("/available/pet/name/{name}")
    public Optional<PetStore> getByPetName(@PathVariable String name){
        return petService.getByPetName(name);
    }

    @GetMapping("/available/pet/age/{age}")
    public Optional<PetStore> getByPetAge(@PathVariable Integer age){
        return petService.getByPetAge(age);
    }

    @GetMapping("/available/pet/name-age/{name}/{age}")
    public PetStore getByTwoParameters(@PathVariable String name, @PathVariable Integer age ){
       return petService.getPetByNameAndAge(name, age);
    }

    @GetMapping("/available/pet/age/{minAge}/{maxAge}")
    public List<PetStore> getByAgeBetween(@PathVariable Integer minAge, @PathVariable Integer maxAge ){
       return petService.getByAgeBetween(minAge, maxAge);
    }

    @PutMapping("/update/{id}")
    public PetStore updateById(@PathVariable Long id, @RequestBody PetStore petStore){
           return petService.update(id, petStore);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteTheId( @PathVariable Long id){
        petService.deleteId(id);
    }


}
