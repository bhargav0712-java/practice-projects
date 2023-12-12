//package com.practice.demo.service;
//
//import com.practice.demo.dto.UniversityDto;
//import com.practice.demo.entity.University;
//import com.practice.demo.repo.UniversityRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UniversityService {
//    private final UniversityRepo universityRepo;
//
//    @Autowired
//    public UniversityService(UniversityRepo universityRepo) {
//        this.universityRepo = universityRepo;
//    }
//
//    private UniversityDto convertToDto(University university){
//        UniversityDto universityDto = new UniversityDto();
//        universityDto.setId(university.getId());
//        universityDto.setName(university.getUniversityName());
//        universityDto.setLocation(university.getAddress());
//        universityDto.setMailId(university.getEmail());
//        universityDto.setLandLineNo(university.getPhoneNo());
//        universityDto.setFee(university.getFee());
//        return universityDto;
//
//    }
//    private University convertToEntity(UniversityDto universityDto){
//        University university = new University();
//        university.setId(universityDto.getId());
//        university.setUniversityName(universityDto.getName());
//        university.setAddress(universityDto.getLocation());
//        university.setEmail(universityDto.getMailId());
//        university.setPhoneNo(universityDto.getLandLineNo());
//        university.setFee(universityDto.getFee());
//        return university;
//    }
//
//    public List<UniversityDto> getAllList(){
//        List <University> universities = universityRepo.findAll();
//        List<UniversityDto> universityDtos = new ArrayList<>();
//        for(University university: universities){
//            universityDtos.add(convertToDto(university));
//        }
//        return universityDtos;
//    }
//
//    public UniversityDto listById(Long id){
//        List<University> universities = universityRepo.findAll();
//        for (University university : universities){
//            if (university.getId().equals(id)){
//                return convertToDto(university);
//            }
//        }
//        return null;
//    }
//
//    public UniversityDto createNew(UniversityDto universityDto){
//        University university = convertToEntity(universityDto);
//        University university1 = universityRepo.save(university);
//        return convertToDto(university1);
//    }
//    /* public UniversityDto createNew(UniversityDto universityDto){
//        return convertTODto(universityRepo.save(convertTOEntity(universityDto)));
//   } */
//
//    public UniversityDto updateOld(long id , UniversityDto universityDto){
//        if(universityRepo.existsById(id)){
//            University university = convertToEntity(universityDto);
//            university.setId(id);
//            return convertToDto(universityRepo.save(university));
//        } else return null;
//    }
//
//    public void delete(Long id){
//        universityRepo.deleteById(id);
//    }
//}
