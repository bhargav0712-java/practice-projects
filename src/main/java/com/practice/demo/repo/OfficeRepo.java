package com.practice.demo.repo;

import com.practice.demo.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepo extends JpaRepository<Office, Long> {
}
