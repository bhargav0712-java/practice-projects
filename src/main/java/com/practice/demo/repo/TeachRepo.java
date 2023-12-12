package com.practice.demo.repo;

import com.practice.demo.entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachRepo extends JpaRepository<Teachers,Long> {
}
