package com.practice.demo.repo;

import com.practice.demo.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopsitalRepo extends JpaRepository<Hospital,String> {
}
