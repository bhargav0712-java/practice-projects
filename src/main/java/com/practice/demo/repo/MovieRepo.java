package com.practice.demo.repo;

import com.practice.demo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Long> {

    @Query("SELECT m FROM Movie m WHERE LOWER(m.title) LIKE %:keyword% OR LOWER(m.director) LIKE %:keyword% OR LOWER(m.genre) LIKE %:keyword% ")
    List<Movie> searchByKeyword (@Param("keyword") String keyword);
}
