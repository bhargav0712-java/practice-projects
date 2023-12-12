package com.practice.demo.repo;

import com.practice.demo.entity.Canteen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CanteenRepo extends JpaRepository<Canteen, Long> {
    List<Canteen> findByPrice(Double price );
    
}
