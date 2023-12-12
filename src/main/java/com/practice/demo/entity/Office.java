package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb017_office")
@Data
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "job_role")
    private String jobRole;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "address")
    private String address;


}
