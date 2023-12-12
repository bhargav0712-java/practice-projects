package com.practice.demo.controller;

import com.practice.demo.dto.MallDto;
import com.practice.demo.entity.Mall;
import com.practice.demo.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mall")
public class MallController {
    private final MallService mallService;
    @Autowired
    public MallController(MallService mallService) {
        this.mallService = mallService;
    }
    @PostMapping("/store/create")
    public MallDto createNewStore(MallDto mallDto){
        return mallService.createNew(mallDto);
    }
    @GetMapping("/store")
    public List<MallDto> getAlllist(){
        return mallService.getAllStores();
    }
    @GetMapping("/store/{storeId}")
    public MallDto findById(@PathVariable Long storeId){
        return mallService.listById(storeId);
    }
    @GetMapping("/store/name/{shopName}")
    public MallDto findByShopName(@PathVariable String shopName){
        return mallService.listByShopName(shopName);
    }
    @GetMapping("/store/genre/{type}")
    public MallDto findByType(@PathVariable String type){
        return mallService.listByType(type);
    }
    @GetMapping("/store/floor/{floorNo}")
    public List<Mall> findByFloorNo(@PathVariable Integer floorNo){

        return mallService.findByFloor(floorNo);
    }
    @PutMapping("/store/update/{storeId}")
    public MallDto updateStore(@PathVariable Long storeId, @RequestBody MallDto mallDto){
        return mallService.updateExisting(storeId, mallDto );
    }
    @DeleteMapping("/store/delete/{storeId}")
    public void deleteStore(@PathVariable Long storeId){
        mallService.deleteStore(storeId);
    }
}
