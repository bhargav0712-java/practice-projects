package com.practice.demo.repo;

import com.practice.demo.entity.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemRepo extends JpaRepository<ToDoItem, Long> {
}
