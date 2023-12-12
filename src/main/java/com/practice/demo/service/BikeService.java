package com.practice.demo.service;

import com.practice.demo.dto.BikeDto;
import com.practice.demo.entity.Bike;
import com.practice.demo.repo.BikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BikeService {
    private final BikeRepo bikeRepo;
   @Autowired
    public BikeService(BikeRepo bikeRepo) {
        this.bikeRepo = bikeRepo;
    }

    private BikeDto convertToDto(Bike bike){
        BikeDto bikeDto = new BikeDto();
        bikeDto.setId(bike.getId());
        bikeDto.setBikeName(bike.getName());
        bikeDto.setBrandName(bike.getBrand());
        bikeDto.setAmount(bike.getPrice());
        bikeDto.setMileage(bike.getMileage());
        return bikeDto;
    }

    private Bike convertToEntity(BikeDto bikeDto){
        Bike bike = new Bike();
        bike.setId(bikeDto.getId());
        bike.setName(bikeDto.getBikeName());
        bike.setBrand(bikeDto.getBrandName());
        bike.setPrice(bikeDto.getAmount());
        bike.setMileage(bikeDto.getMileage());

        return bike;
    }

    public List<BikeDto> getList(){
       List<Bike> bikeList = bikeRepo.findAll();
       List<BikeDto> bikeDtoList = new ArrayList<>();
       for (Bike bike : bikeList){
           bikeDtoList.add(convertToDto(bike));
       }
       return bikeDtoList;
    }

    /*public BikeDto listById(Long id){
       List<Bike> bikeList = bikeRepo.findAll();
       for(Bike bike : bikeList){
           if (bike.getId().equals(id)){
               return convertToDto(bike);
           }
       }
       return null;
    }*/
    public BikeDto listById(Long id){
        Bike bike = bikeRepo.findById(id).orElse(null);
        if( bike == null){
            return null;
        }
        return convertToDto(bike);
    }
    public BikeDto createBike(BikeDto bikeDto){
        Bike bikeList = convertToEntity(bikeDto);
        Bike bike = bikeRepo.save(bikeList);
        return convertToDto(bike);
    }
    public BikeDto updateBike(Long id, BikeDto bikeDto){
        if(bikeRepo.existsById(id)){
            Bike bike = convertToEntity(bikeDto);
            bike.setId(id);
            return convertToDto(bikeRepo.save(bike));
        } else return null;
    }
    public void delete(Long id){
        bikeRepo.deleteById(id);
    }

   public List<Bike> findByName(String name){
        return bikeRepo.findByName(name);
    }
   public List<Bike> findByBrand(String brand){
        return bikeRepo.findByBrand(brand);
   }
   public List<Bike> findByPriceLessThan(Double price){
        return bikeRepo.findByPriceLessThan(price);
   }
   public List<Bike> findByMileageGreaterThan(Long mileage){
        return bikeRepo.findByMileageGreaterThan(mileage);
   }

   public List<Bike> findByOrderByAsc(){
        return bikeRepo.findByOrderByPriceAsc();
   }

    public List<Bike> findByOrderByMileageDesc(){
        return bikeRepo.findByOrderByMileageDesc();
    }

    public List<Bike> findByNameLike(String name){

        return bikeRepo.findByNameLikeIgnoreCase(name);
    }
    public List<Bike> findByBrandContains(String brand){

        return bikeRepo.findByBrandContainsIgnoreCase(brand);
    }

    public List<Bike> findByNameStartingWith(String prefix){

        return bikeRepo.findByNameStartingWithIgnoreCase(prefix);
    }

    public List<Bike> findByPriceBetween(Double minPrice, Double maxPrice){
        return bikeRepo.findByPriceBetween(minPrice, maxPrice);
    }





}
