package com.practice.demo.service;

import com.practice.demo.entity.PetStore;
import com.practice.demo.repo.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    private PetRepo petRepo;
    @Autowired
    public PetService(PetRepo petRepo) {
        this.petRepo = petRepo;
    }

    public List<PetStore> getAllList(){
        return petRepo.findAll();
    }
    public PetStore createNew(PetStore petStore){
        return petRepo.save(petStore);
    }
    public Optional<PetStore> listById(Long id){
        return petRepo.findById(id);
    }
    public PetStore update(Long id,  PetStore petStore ){
        if (petRepo.existsById(id)){
            petStore.setId(id);
            return petRepo.save(petStore);
        }
        return null;
    }
    public void deleteId(Long id){
        petRepo.deleteById(id);
    }

    public Optional<PetStore> getByPetId(Long id) {
        return petRepo.findById(id);
    }

    public Optional<PetStore> getByPetName(String name) {
        return petRepo.findByName(name);
    }

    public Optional<PetStore> getByPetAge(Integer age){
        return petRepo.findByAge(age);
    }

    public PetStore getPetByNameAndAge(String name, Integer age){
        return petRepo.findByNameAndAge(name, age);
    }

    public List<PetStore> getByAgeBetween(Integer minAge, Integer maxAge){
        return petRepo.findByAgeBetween(minAge, maxAge);
    }
}