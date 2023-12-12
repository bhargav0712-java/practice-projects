package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name="tb005_emp")
@Data
public class Wipro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "emp_id")
    private Long id;
    
    @Column(name= "name")
    private String name;
    
    @Column(name= "gender")
    private String gender;
    
    @Column(name= "role")
    private String role;
    
    @Column(name= "experience")
    private Long experience;


}
