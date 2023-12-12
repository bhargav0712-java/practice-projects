package com.practice.demo.repo;

import com.practice.demo.entity.Mall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MallRepo extends JpaRepository<Mall, Long> {
    Mall findByStoreNameIgnoreCase(String storeName);
    Mall findByGenreIgnoreCase(String genre);

   List<Mall> findByFloorNo(Integer floorNo);
}
