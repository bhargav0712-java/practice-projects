package com.practice.demo.repo;

import com.practice.demo.entity.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface PetRepo extends JpaRepository<PetStore, Long> {
    Optional<PetStore> findByName(String name);
    Optional<PetStore> findByAge(Integer age);

    List<PetStore> findByAgeBetween(Integer minAge, Integer maxAge);

    PetStore findByNameAndAge(String name, Integer age);
}
