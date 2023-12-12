package com.practice.demo.service;


import com.practice.demo.entity.CarRental;

import java.util.List;
import java.util.Optional;

public interface CarRentalService  {
     List<CarRental> listAllEmp();
     Optional<CarRental> findById(Long id);
     CarRental createEmp( CarRental carRental);

     CarRental updateEmp(CarRental carRental);

     void deleteEmp(Long id);
}
