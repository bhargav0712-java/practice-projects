package com.practice.demo.controller;

import com.practice.demo.dto.BikeDto;
import com.practice.demo.entity.Bike;
import com.practice.demo.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeController {
    private final BikeService bikeService;
    @Autowired
    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }
    @PostMapping("/create")
    public BikeDto createNew(@RequestBody BikeDto bikeDto){
        return bikeService.createBike(bikeDto);
    }
    @GetMapping("/list")
    public List<BikeDto> getAllList(){
        return bikeService.getList();
    }
    @GetMapping("/list/{id}")
    public BikeDto listById(@PathVariable Long id){
        return bikeService.listById(id);
    }
    @PutMapping("/update/{id}")
    public BikeDto updateById(@PathVariable Long id, @RequestBody BikeDto bikeDto){
        return bikeService.updateBike(id, bikeDto);
    }
    @DeleteMapping("/remove/{id}")
    public void deleteById(@PathVariable Long id){
        bikeService.delete(id);
    }
    @GetMapping("/list/name/{name}")
    public List<Bike> FindByName(@PathVariable String name){
        return bikeService.findByName(name);
    }

    @GetMapping("/list/brand/{brand}")
    public List<Bike> FindByBrand(@PathVariable String brand){
        return bikeService.findByBrand(brand);
    }

    @GetMapping("/list/price/{price}")
    public List<Bike> FindByPriceLessThan(@PathVariable Double price){
        return bikeService.findByPriceLessThan(price);
    }
    @GetMapping("/list/mileage/{mileage}")
    public List<Bike> FindByMileageGreaterThan(@PathVariable Long mileage){
        return bikeService.findByMileageGreaterThan(mileage);
    }

    @GetMapping("/list/price/asc")
    public List<Bike> FindByOrderByPriceAsc(){
        return bikeService.findByOrderByAsc();
    }
    @GetMapping("/list/mileage/desc")
    public List<Bike> FindByOrderByMileageDesc(){
        return bikeService.findByOrderByMileageDesc();
    }
    @GetMapping("/list/name/like/{name}")
    public List<Bike> FindByNameLike(@PathVariable String name){
        return bikeService.findByNameLike(name);
    }
    @GetMapping("/list/brand/like/{brand}")
    public List<Bike> findByBrandContain(@PathVariable String brand){
        return bikeService.findByBrandContains(brand);
    }
    @GetMapping("/list/name/starting/{prefix}")
    public List<Bike> findByNameStartingWith(@PathVariable String prefix){
        return bikeService.findByNameStartingWith(prefix);
    }
    @GetMapping("/list/price/{minPrice}/{maxPrice}")
    public List<Bike> findByPriceBetween(@PathVariable Double minPrice, @PathVariable Double maxPrice){
        return bikeService.findByPriceBetween(minPrice, maxPrice);
    }

}
