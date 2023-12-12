package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb007_college")
@Data
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private Long studentId;

    @Column(name="student_name")
    private String studentName;

    @Column(name="year")
    private Integer year;

    @Column(name="department")
    private String department;

    @Column(name="email_id")
    private String emailId;

    @Column(name="phone_no")
    private String phoneNo;


}
