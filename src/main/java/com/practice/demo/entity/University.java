package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "tb022_university")
@Data
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private Long phoneNo;

    @Column(name = "fee")
    private Double fee;

}
