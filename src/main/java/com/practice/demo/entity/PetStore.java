package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb013_pet_store")
@Data
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "breed" )
    private String breed;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "price")
    private Double price;

    @Column(name = "available")
    private  Boolean available;


    public void setId(Long id) {
    }
}
