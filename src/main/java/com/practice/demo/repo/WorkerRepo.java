package com.practice.demo.repo;

import com.practice.demo.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker,Long> {
}
