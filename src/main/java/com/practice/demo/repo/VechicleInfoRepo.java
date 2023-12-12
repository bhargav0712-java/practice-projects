package com.practice.demo.repo;


import com.practice.demo.entity.VechicleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VechicleInfoRepo extends JpaRepository<VechicleInfo,String> {

}
