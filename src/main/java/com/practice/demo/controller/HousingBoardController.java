package com.practice.demo.controller;

import com.practice.demo.dto.HousingSociety;
import com.practice.demo.service.HousingBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venture")
public class HousingBoardController {
    private final HousingBoardService housingBoardService;

    @Autowired
    public HousingBoardController(HousingBoardService housingBoardService) {
        this.housingBoardService = housingBoardService;
    }

    @GetMapping("/details")
    public List<HousingSociety> getAllList(){
        return housingBoardService.getAllRecords();
    }

    @GetMapping("/details/{plotNo}")
    public HousingSociety listById(@PathVariable Long plotNo){
        return housingBoardService.listById(plotNo);
    }
    @PostMapping("/create")
    public HousingSociety createNewRecord( @RequestBody HousingSociety housingSociety){
        return housingBoardService.createNew(housingSociety);
    }
    @PutMapping("/update/{plotNo}")
    public HousingSociety updateOldRecord( @PathVariable Long plotNo, @RequestBody HousingSociety housingSociety){
        return housingBoardService.updateExisting(plotNo, housingSociety);
    }
    @DeleteMapping("/remove/{plotNo}")
    public void deleteRecord(@PathVariable Long plotNo){
        housingBoardService.deleteRecord(plotNo);
    }
}
