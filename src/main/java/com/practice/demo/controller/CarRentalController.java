package com.practice.demo.controller;

import com.practice.demo.entity.CarRental;
import com.practice.demo.service.CarRentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrentals")
public class CarRentalController {
    private final CarRentalService method2;

    public CarRentalController (CarRentalService method2){
        this.method2 = method2;
    }

    @GetMapping
    public List<CarRental> details(){
        return method2.listAllEmp();
    }
    @GetMapping("/{id}")
    public Optional<CarRental> detailsById(@PathVariable("id") Long id){
        return method2.findById(id);
    }
    @PostMapping("/create")
    public CarRental createNew(@RequestBody CarRental carRental){
        return method2.createEmp( carRental);
    }
    @PutMapping("/update{id}")
    public CarRental updateOld(@PathVariable("id") Long id, @RequestBody CarRental carRental){
        return method2.updateEmp(carRental);
    }
    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable("id") Long id){
        method2.deleteEmp(id);
    }

}
