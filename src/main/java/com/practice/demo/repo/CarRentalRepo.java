package com.practice.demo.repo;

import com.practice.demo.entity.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRentalRepo extends JpaRepository<CarRental, Long> {
}
