package com.practice.demo.repo;

import com.practice.demo.entity.Liquor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiquorRepo extends JpaRepository<Liquor, Long> {
    Liquor findByStoreNameAndAddressAndProfitPerDay(String storeName, String address, Double profitPerDay );
    Liquor findByStoreNameAndProfitPerDay(String storeName, Double profitPerDay);
}
