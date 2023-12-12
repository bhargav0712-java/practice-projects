package com.practice.demo.service;

import com.practice.demo.dto.InfosysDto;
import com.practice.demo.entity.Infosys;
import com.practice.demo.repo.InfosysRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InfosysService {
    private InfosysRepo infosysRepo;

    @Autowired
    public InfosysService(InfosysRepo infosysRepo){
        this.infosysRepo = infosysRepo;
    }

    public List<Infosys> getAllList(){
        return infosysRepo.findAll();
    }
    public Optional<Infosys> ListById(Long id){
        return infosysRepo.findById(id);
    }

    public Infosys createNew(Infosys infosys){
        return infosysRepo.save(infosys);
    }

    public Infosys updateExisting(Long id, Infosys infosys){
        if(infosysRepo.existsById(id)){
            infosys.setId(id);
            return infosysRepo.save(infosys);
        }
        return null;
    }
    public void deletePost(Long id){
        infosysRepo.deleteById(id);
    }


    private InfosysDto convertEntityToDto(Infosys infosys){
        InfosysDto infosysDto = new InfosysDto();
        infosysDto.setId(infosys.getId());
        infosysDto.setJobRole(infosys.getJobRole());
        infosysDto.setVacancy(infosys.getVacancy());
        infosysDto.setSkillsRequired(infosys.getSkillsRequired());
        return infosysDto;
    }
    
    public List<InfosysDto> getAllDetails(){
        return infosysRepo.findAll()
        .stream()
                .map(this::convertEntityToDto)
               .collect(Collectors.toList());

    }

}

