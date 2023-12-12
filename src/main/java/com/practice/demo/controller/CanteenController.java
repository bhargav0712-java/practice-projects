package com.practice.demo.controller;

import com.practice.demo.CanteenDTO;
import com.practice.demo.entity.Canteen;
import com.practice.demo.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/canteen")
public class CanteenController {

    private final CanteenService canteenService;
    @Autowired
    public CanteenController(CanteenService canteenService) {
        this.canteenService = canteenService;
    }

    @PostMapping("/add")
    public Canteen createNewItem(@RequestBody Canteen canteen){
        return canteenService.createItem(canteen);
    }
    @GetMapping("/food")
    public List<Canteen> showAllItems(){
        return canteenService.getAllItems();
    }
     @GetMapping("/food/{id}")
    public CanteenDTO  showItemById(@PathVariable Long id){

        return canteenService.listById(id);
    }

    @GetMapping("/food/price/{price}")
    public List<Canteen> findByPrice(@PathVariable Double price){
        return canteenService.findByPrice(price);
    }

    @PutMapping("/update/{id}")
    public Canteen updateItem(@PathVariable Long id, @RequestBody Canteen canteen){
        return canteenService.updateItem(id, canteen);
    }
     @DeleteMapping("/remove/{id}")
    public String deleteItem(@PathVariable Long id){
        return canteenService.deleteItem(id);
    }
}
