package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb019_housing_board")
@Data
public class HousingBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile_number")
    private Integer mobile_number;

    @Column(name = "area_in_sft")
    private Double areaInSft;

    @Column(name = "price")
    private Double price;

}
