package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb006_hospital")
@Data
public class Hospital {

    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "name")
    private String name;

    @Column(name = "speclization")
    private String speclization;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "experience")
    private Integer experience;

}
