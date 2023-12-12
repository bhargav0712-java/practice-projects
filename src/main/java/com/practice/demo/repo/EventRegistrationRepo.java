package com.practice.demo.repo;

import com.practice.demo.entity.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRegistrationRepo extends JpaRepository<EventRegistration, Long> {
}
