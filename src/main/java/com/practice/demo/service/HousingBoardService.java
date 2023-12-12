package com.practice.demo.service;

import com.practice.demo.dto.HousingSociety;
import com.practice.demo.entity.HousingBoard;
import com.practice.demo.repo.HousingBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HousingBoardService {
    public final HousingBoardRepo housingBoardRepo;

    @Autowired
    public HousingBoardService(HousingBoardRepo housingBoardRepo) {
        this.housingBoardRepo = housingBoardRepo;
    }

    private HousingSociety convertEntityToDto(HousingBoard housingBoard){
        HousingSociety houseSociety = new HousingSociety();
        houseSociety.setPlotNO(housingBoard.getId());
        houseSociety.setOwnerName(housingBoard.getName());
        houseSociety.setMobile_number(housingBoard.getMobile_number());
        houseSociety.setArea(housingBoard.getAreaInSft());
        houseSociety.setAmount(housingBoard.getPrice());
        return houseSociety;
    }

    private HousingBoard convertDtoToEntity( HousingSociety housingSociety){
        HousingBoard housingBoard = new HousingBoard();
        housingBoard.setId(housingSociety.getPlotNO());
        housingBoard.setName(housingSociety.getOwnerName());
        housingBoard.setMobile_number(housingSociety.getMobile_number());
        housingBoard.setAreaInSft(housingSociety.getArea());
        housingBoard.setPrice(housingSociety.getAmount());
        return housingBoard;
    }

    public List<HousingSociety> getAllRecords(){
        List<HousingBoard> housingBoardList = housingBoardRepo.findAll();
        List<HousingSociety> housingSocietyList = new ArrayList<>();
        for( HousingBoard housingBoard : housingBoardList){
            housingSocietyList.add(convertEntityToDto( housingBoard));
        }
        return housingSocietyList;
    }

    public HousingSociety listById( Long plotNo){
        HousingBoard housingBoard = housingBoardRepo.findById(plotNo).orElse(null);
        return (housingBoard != null) ? convertEntityToDto(housingBoard) : null ;
    }



    public HousingSociety createNew( HousingSociety housingSociety){
        HousingBoard housingBoard = convertDtoToEntity(housingSociety);
        HousingBoard save = housingBoardRepo.save(housingBoard);
        return convertEntityToDto( save);
    }

    public HousingSociety updateExisting( Long plotNo, HousingSociety updatedHosingSociety){
        if(housingBoardRepo.existsById(plotNo)){
            HousingBoard updatedHousingBoard  = convertDtoToEntity( updatedHosingSociety);
            updatedHousingBoard.setId(plotNo);
            HousingBoard saveHousingBoard = housingBoardRepo.save(updatedHousingBoard);
            return convertEntityToDto( saveHousingBoard);
        }
        return null;
    }

    public void deleteRecord(Long plotNo){
        housingBoardRepo.deleteById(plotNo);
    }
}
