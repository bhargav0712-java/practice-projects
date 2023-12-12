package com.practice.demo.controller;

import com.practice.demo.dto.LiquorDto;
import com.practice.demo.service.LiquorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liquor")
public class LiquorController {
    private final LiquorService liquorService;

    public LiquorController(LiquorService liquorService) {
        this.liquorService = liquorService;
    }

    @GetMapping("/store/details")
    public List<LiquorDto> getAllStoreDetails(){
        return liquorService.getAllDetails();
    }
    @GetMapping("/store/details/{storeId}")
    public LiquorDto getStoreDetailByID(@PathVariable Long storeId){
        return liquorService.listById(storeId);
    }
    @GetMapping("/store/details/store-profit/{name}/{profit}")
    public LiquorDto getStoreDetailsBy2Param(@PathVariable String name,@PathVariable  Double profit){
        return  liquorService.listByStoreAndProfit(name, profit);
    }
    @GetMapping("/store/details/param/{name}/{location}/{profit}")
    public LiquorDto getStoreDetailsBy3Param(@PathVariable String name, @PathVariable String location, @PathVariable Double profit){
        return liquorService.ListBy3Parameters(name, location , profit);
    }
    @PostMapping("/store/details/create")
    public LiquorDto createNew(@RequestBody LiquorDto liquorDto){
        return liquorService.createNew(liquorDto);
    }
    @PutMapping("/store/details/update/{storeId}")
    public LiquorDto updateRecord(@PathVariable Long storeId, @RequestBody LiquorDto liquorDto){
        return liquorService.updateRecord(storeId, liquorDto);
    }
    @DeleteMapping("/store/remove/{storeID}")
    public void deleteRecord(@PathVariable Long storeId){
        liquorService.deleteStore(storeId);
    }

}
