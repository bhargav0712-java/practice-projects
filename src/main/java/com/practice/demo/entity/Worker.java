package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb008_Worker")
@Data
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Long id;

    @Column(name= "name")
    private String name;

    @Column(name= "gender")
    private String gender;

    @Column(name= "salary")
    private String salary;

    @Column(name= "address")
    private String address;

}
