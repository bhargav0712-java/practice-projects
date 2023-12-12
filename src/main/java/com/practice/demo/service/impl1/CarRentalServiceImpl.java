package com.practice.demo.service.impl1;

import com.practice.demo.entity.CarRental;
import com.practice.demo.repo.CarRentalRepo;
import com.practice.demo.service.CarRentalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarRentalServiceImpl implements CarRentalService {

    private final CarRentalRepo method1;

    public CarRentalServiceImpl(CarRentalRepo method1) {
        this.method1 = method1;
    }
    @Override
    public List<CarRental> listAllEmp() {
        return method1.findAll();
    }

    @Override
    public Optional<CarRental> findById(Long id) {
        return  method1.findById(id);
    }

    @Override
    public CarRental createEmp(CarRental carRental) {
        return method1.save(carRental);
    }

    @Override
    public CarRental updateEmp(CarRental carRental) {
        return method1.save(carRental);
    }

    @Override
    public void deleteEmp(Long id) {
        method1.deleteById(id);

    }
}
