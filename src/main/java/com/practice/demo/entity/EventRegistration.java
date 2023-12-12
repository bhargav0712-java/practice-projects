package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tb011_event_registration")
@Data
public class EventRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "address")
    private String address;

    @Column(name = "organizer")
    private String organizer;

    @Column(name = "amount")
    private Double amount;


}
