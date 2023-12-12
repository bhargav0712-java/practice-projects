//package com.practice.demo.controller;
//
//import com.practice.demo.dto.UniversityDto;
//import com.practice.demo.service.UniversityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/university")
//public class UniversityController {
//    private final UniversityService universityService;
//
//    @Autowired
//    public UniversityController(UniversityService universityService) {
//        this.universityService = universityService;
//    }
//
//    @GetMapping("/list")
//    public List<UniversityDto> getAllUniversity(){
//
//        return universityService.getAllList();
//    }
//
//    @GetMapping("/list/{id}")
//    public UniversityDto listBYId(@PathVariable Long id){
//        return universityService.listById(id);
//    }
//
//    @PostMapping("/create")
//    public UniversityDto createNew(UniversityDto universityDto){
//
//        return universityService.createNew(universityDto);
//    }
//
//    @PutMapping("update/{id}")
//    public UniversityDto updateRecord(@PathVariable Long id, @RequestBody UniversityDto universityDto){
//        return universityService.updateOld(id, universityDto);
//    }
//    @DeleteMapping("delete/{id}")
//    public void deleteRecord(@PathVariable Long id){
//        universityService.delete(id);
//    }
//
//}
