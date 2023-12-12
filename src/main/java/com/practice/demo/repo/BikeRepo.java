package com.practice.demo.repo;

import com.practice.demo.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Long> {
    List<Bike> findByName(String name);
    List<Bike> findByBrand(String brand);
    List<Bike> findByPriceLessThan(Double price);
    List<Bike> findByMileageGreaterThan(Long mileage);
    List<Bike> findByOrderByPriceAsc();
    List<Bike> findByOrderByMileageDesc();
    List<Bike> findByNameLikeIgnoreCase(String name);
    List<Bike> findByBrandContainsIgnoreCase(String brand);
    List<Bike> findByNameStartingWithIgnoreCase(String prefix);
    List<Bike> findByPriceBetween(Double minPrice, Double maxPrice);




}
