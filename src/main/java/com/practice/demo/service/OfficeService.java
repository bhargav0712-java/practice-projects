package com.practice.demo.service;

import com.practice.demo.dto.OfficeDto;
import com.practice.demo.entity.Office;
import com.practice.demo.repo.OfficeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OfficeService {
    private final OfficeRepo officeRepo;
    public OfficeService(OfficeRepo officeRepo) {
        this.officeRepo = officeRepo;
    }

    private OfficeDto convertEntityToDto( Office office){
        OfficeDto officeDto = new OfficeDto();
        officeDto.setEmpId(office.getId());
        officeDto.setEmpName(office.getName());
        officeDto.setEmpJobRole(office.getJobRole());
        officeDto.setEmpSalary(office.getSalary());
        officeDto.setEmpEmail(office.getEmail());
        officeDto.setEmpAddress(office.getAddress());
        return officeDto;
    }

    private Office convertDtoToEntity(OfficeDto officeDto, Office office) {
        office.setId(officeDto.getEmpId());
        office.setName(officeDto.getEmpName());
        office.setJobRole(officeDto.getEmpJobRole());
        office.setSalary(officeDto.getEmpSalary());
        office.setEmail(officeDto.getEmpEmail());
        office.setAddress(officeDto.getEmpAddress());
        return office;
    }

    // To Display All
    public List<OfficeDto> getAllEmpDetails(){
        List<Office> officeList = officeRepo.findAll();
        List<OfficeDto> officeDtoList = new ArrayList<>();

        for( Office office : officeList){
//            OfficeDto officeDto = convertEntityToDto(office);
//            officeDtoList.add(officeDto);
            officeDtoList.add(convertEntityToDto(office));
        }
        return officeDtoList;

    }

    // To Display by Single ID
    public OfficeDto listById(Long empId){
        Optional<Office> optionalOffice = officeRepo.findById(empId);
        if ( optionalOffice.isPresent()){
            return  convertEntityToDto(optionalOffice.get());
        } else return  null;

    }

    // TO Create NEW

    public OfficeDto createNew(OfficeDto officeDto){
        Office office = convertDtoToEntity(officeDto);
        Office savedOffice = officeRepo.save(office);
        return  convertEntityToDto(savedOffice);
    }

    private Office convertDtoToEntity(OfficeDto officeDto) {
        Office office = new Office();
        return office;
    }

    // to Update

    public OfficeDto updateOffice( Long empId, OfficeDto officeDto ){
        Optional<Office> optionalOffice = officeRepo.findById(empId);
        if(optionalOffice.isPresent()){
            Office existingOffice = optionalOffice.get();
            convertDtoToEntity(officeDto, existingOffice);
            Office updatedOffice = officeRepo.save(existingOffice);
            return convertEntityToDto(updatedOffice);
        }
        else return  null;
    }

    public void deleteId(long empId){
        officeRepo.deleteById(empId);

    }

}
