package com.practice.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb002_vehicle_details")
@Data
public class VechicleInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicle_no",unique = true)
    private String vehicleNo;

    @Column (name = "owner_name")
    private String ownerName;
    @Column (name = "car_comp")
    private String carComp;

    @Column(name = "production_year")
    private long producationYear;


    }

