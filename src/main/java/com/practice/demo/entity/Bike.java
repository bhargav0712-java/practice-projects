package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.YearMonth;

@Entity
@Table(name = "tb023_bike")
@Data
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price")
    private Double price;

    @Column(name = "mileage")
    private Long mileage ;



}
