package com.practice.demo.service;

import com.practice.demo.dto.LiquorDto;
import com.practice.demo.entity.Liquor;
import com.practice.demo.repo.LiquorRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LiquorService {
    private final LiquorRepo liquorRepo;

    public LiquorService(LiquorRepo liquorRepo) {
        this.liquorRepo = liquorRepo;
    }

    private LiquorDto convertToDto(Liquor liquor){
        LiquorDto liquorDto = new LiquorDto();
        liquorDto.setStoreId(liquor.getId());
        liquorDto.setName(liquor.getStoreName());
        liquorDto.setLocation(liquor.getAddress());
        liquorDto.setStoreLicenseNo(liquor.getLicenseNo());
        liquorDto.setTotalAmount(liquor.getAmount());
        liquorDto.setProfit(liquor.getProfitPerDay());
        return liquorDto;
    }
    private Liquor convertToEntity(LiquorDto liquorDto){
        Liquor liquor = new Liquor();
        liquor.setId(liquorDto.getStoreId());
        liquor.setStoreName(liquorDto.getName());
        liquor.setAddress(liquorDto.getLocation());
        liquor.setLicenseNo(liquorDto.getStoreLicenseNo());
        liquor.setAmount(liquorDto.getTotalAmount());
        liquor.setProfitPerDay(liquorDto.getProfit());
        return liquor;

    }

    public List<LiquorDto> getAllDetails(){
        List<Liquor> liquorList = liquorRepo.findAll();
        List<LiquorDto> liquorDtoList = new ArrayList<>();
        for(Liquor liquor: liquorList){
            liquorDtoList.add(convertToDto(liquor));
        }
        return  liquorDtoList;
    }

    public LiquorDto listById(Long storeID){
        Liquor liquor = liquorRepo.findById(storeID).orElse(null);
        return (liquor != null) ? convertToDto(liquor) : null ;
    }

    public LiquorDto listByStoreAndProfit( String name, Double profit){
        Liquor liquor = liquorRepo.findByStoreNameAndProfitPerDay(name, profit);
        return convertToDto(liquor);
    }

    public LiquorDto ListBy3Parameters( String name, String location, Double profit){
        Liquor liquor = liquorRepo.findByStoreNameAndAddressAndProfitPerDay(name, location, profit);
        return convertToDto(liquor);
    }
    public LiquorDto createNew(LiquorDto liquorDto){
        Liquor liquor = convertToEntity(liquorDto);
        Liquor saveLiquor = liquorRepo.save(liquor);
        return convertToDto(saveLiquor);
    }
    public LiquorDto updateRecord(Long storeId , LiquorDto updateLiquorDto){
        if(liquorRepo.existsById(storeId)){
            Liquor liquors = convertToEntity(updateLiquorDto);
            liquors.setId(storeId);
            Liquor liquor2 = liquorRepo.save(liquors);
            return convertToDto(liquor2);
        }
        return  null;
    }
    public void deleteStore(Long storeId){
        liquorRepo.deleteById(storeId);
    }

}
