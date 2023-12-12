package com.practice.demo.repo;

import com.practice.demo.entity.Infosys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfosysRepo extends JpaRepository<Infosys,Long> {

//    @Query("SELECT i FROM INFOSYS i WHERE LOWER(i.location) LIKE %:keyword% OR LOWER(i.skills_required) LIKE %:Keyword% OR LOWER(i.job_role) LIKE %:keyword% ")
//    List<Infosys> findByKeyword(@Param("keyword") String keyword);
}
