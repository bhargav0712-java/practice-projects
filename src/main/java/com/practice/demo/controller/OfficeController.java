package com.practice.demo.controller;

import com.practice.demo.dto.OfficeDto;
import com.practice.demo.service.OfficeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {

    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping("/record")
    public List<OfficeDto> getAllList() {
        return officeService.getAllEmpDetails();
    }

    @GetMapping("/record/{empId}")
    public OfficeDto getOnlyOneRecord(@PathVariable Long empId) {
        return officeService.listById(empId);
    }

    @PostMapping("create")
    public OfficeDto createNew(OfficeDto officeDto) {
        return officeService.createNew(officeDto);
    }

    @PutMapping("update/{empId}")
    public OfficeDto updateId(@PathVariable Long empId, @RequestBody OfficeDto officeDto) {
        return officeService.updateOffice(empId, officeDto);
    }
     @DeleteMapping("delete/{empId}")
    public void deleteById(Long empId){
        officeService.deleteId(empId);
     }
}
