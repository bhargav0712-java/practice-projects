package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb013_infosys")
@Data
public class Infosys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "job_role")
    private String jobRole;

    @Column(name = "location")
    private String location;

    @Column(name = "skills_required")
    private String skillsRequired;

    @Column(name = "vacancy")
    private Integer vacancy;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "salary_offered")
    private Double salaryOffered;


}
