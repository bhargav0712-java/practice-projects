package com.practice.demo.service;

import com.practice.demo.CanteenDTO;
import com.practice.demo.entity.Canteen;
import com.practice.demo.repo.CanteenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CanteenService {

    private final CanteenRepo canteenRepo;

    @Autowired
    public CanteenService(CanteenRepo canteenRepo) {
        this.canteenRepo = canteenRepo;
    }

    // list All Items
    public List<Canteen> getAllItems(){
        return canteenRepo.findAll();
    }

    // list only by single id
    public CanteenDTO listById(Long id) {
        Optional<Canteen> optionalCanteen = canteenRepo.findById(id);

        CanteenDTO canteenDTO = new CanteenDTO();

        if (optionalCanteen.isPresent()) {
            Canteen canteen = optionalCanteen.get();

            // Map Canteen entity to CanteenDTO
//            canteenDTO.setId(canteen.getId());
            canteenDTO.setItem(canteen.getItem());
            canteenDTO.setAvailable(canteen.getAvailable());
            canteenDTO.setPrice(canteen.getPrice());
//            canteenDTO.setTimeTakenToPrepare(canteen.getTimeTakenToPrepare());
//            canteenDTO.setCustomerRating(canteen.getCustomerRating());
        }

        return canteenDTO;
    }



    // to create new item
    public Canteen createItem(Canteen canteen){
        return canteenRepo.save(canteen);
    }

    //find By price
    public List<Canteen> findByPrice(Double price){
        return canteenRepo.findByPrice(price);
    }

    // to update any item
    public Canteen updateItem(Long id, Canteen canteen){
        if(canteenRepo.existsById(id)){
            canteen.setId(id);
            return canteenRepo.save(canteen);
        }
        return null;
    }
    // to delete item

    public String deleteItem(Long id){
        canteenRepo.deleteById(id);
        return "Your item has been deleted";
    }
}
