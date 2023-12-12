package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="tb004_teacher_list")
@Data
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "teacher_id")
    private  Long teacherId;

    @Column(name= "name")
    private  String name;

    @Column(name= "subject")
    private String subject;

    @Column(name= "experience")
    private Integer experience;


}
