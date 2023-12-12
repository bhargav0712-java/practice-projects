package com.practice.demo.service;

import com.practice.demo.dto.MallDto;
import com.practice.demo.entity.Mall;
import com.practice.demo.repo.MallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MallService {
    private final MallRepo mallRepo;
    @Autowired
    public MallService(MallRepo mallRepo) {
        this.mallRepo = mallRepo;
    }

    private MallDto convertToDto (Mall mall){
        MallDto mallDto = new MallDto();
        mallDto.setStoreId(mall.getId());
        mallDto.setShopName(mall.getStoreName());
        mallDto.setType(mall.getGenre());
        mallDto.setFloor(mall.getFloorNo());
        mallDto.setAmount(mall.getRent());
        return mallDto;
    }

    private Mall convertToEntity(MallDto mallDto){
        Mall mall= new Mall();
        mall.setId(mallDto.getStoreId());
        mall.setStoreName(mallDto.getShopName());
        mall.setGenre(mallDto.getType());
        mall.setFloorNo(mallDto.getFloor());
        mall.setRent(mallDto.getAmount());
        return mall;
    }

    public List<MallDto> getAllStores(){
        List<Mall> mallList = mallRepo.findAll();
        List<MallDto> mallDtoList = new ArrayList<>();
        for(Mall mall : mallList){
            mallDtoList.add(convertToDto(mall));
        }
        return mallDtoList;
    }
//    public MallDto listById(Long storeId){
//        Mall mall = mallRepo.findById(storeId).orElse(null);
//        return (mall != null) ? convertToDto(mall): null ;
//    }
    public MallDto listById(Long storeId){
        Mall mall = mallRepo.findById(storeId).orElse(null);
        if(mall == null ){
            return null;
        } return convertToDto(mall);
    }
    public MallDto listByShopName(String shopName){
        Mall mall = mallRepo.findByStoreNameIgnoreCase(shopName);
        if(mall == null){
            return null;
        }
        return convertToDto(mall);
    }
    public List<Mall> findByFloor(Integer floorNo) {
       return mallRepo.findByFloorNo(floorNo);
       /* if(mall == null){
            return null;
        }
        return (List<Mall>) convertToDto(mall);*/

    }

//    public MallDto listByShopName(String shopName){
//        Mall mall = mallRepo.findByStoreName(shopName);
//        return convertToDto(mall);
//    }


    public MallDto listByType(String type){
        Mall mall = mallRepo.findByGenreIgnoreCase(type);
        return convertToDto(mall);
    }
    public MallDto createNew(MallDto mallDto){
        Mall mall = convertToEntity(mallDto);
        Mall saveMall = mallRepo.save(mall);
        return convertToDto(saveMall);
    }
    public MallDto updateExisting(Long storeId, MallDto updateMall){
        if(mallRepo.existsById(storeId)){
            Mall mall1 = convertToEntity(updateMall);
            mall1.setId(storeId);
            Mall mall2 = mallRepo.save(mall1);
            return convertToDto(mall2);
        }
        return null;
    }
    public void deleteStore(Long storeId){
        mallRepo.deleteById(storeId);
    }


}
