package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb008_car_rental")
@Data
public class CarRental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="car_name")
    private String carName;
    @Column(name="capacity")
    private Integer maxSeater;
    @Column(name="price_per_day")
    private Long pricePerDay;

    @Column(name="fuel_capacity")
    private Long fuelCapacity;

}
