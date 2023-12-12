package com.practice.demo.repo;

import com.practice.demo.entity.StudentRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegisterRepo extends JpaRepository<StudentRegister,Long> {
}