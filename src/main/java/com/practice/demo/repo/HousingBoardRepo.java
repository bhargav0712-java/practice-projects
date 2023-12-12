package com.practice.demo.repo;

import com.practice.demo.entity.HousingBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingBoardRepo extends JpaRepository<HousingBoard,Long> {
}
