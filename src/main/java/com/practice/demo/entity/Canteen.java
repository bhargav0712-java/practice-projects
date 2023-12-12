package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb016_canteenss")
@Data
public class Canteen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "item")
    private String item;

    @Column(name = "available")
    private Boolean available;

    @Column(name = "price")
    private Double price;

    @Column(name = "time_require_to_prepare")
    private Integer timeTakenToPrepare;

    @Column(name = "customer_rating")
    private Float customerRating;

}
