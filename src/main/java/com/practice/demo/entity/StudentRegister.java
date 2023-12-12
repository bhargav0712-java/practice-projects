package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tb001_student_details")
@Data
public class StudentRegister{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "student_id")
    private Long studentId;

    @Column( name = "student_name")
    private String studentName;

    @Column( name = "father_name")
    private String fatherName;

//    public long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(long studentId) {
//        this.studentId = studentId;
//    }
//
//    public long getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(long studentName) {
//        this.studentName = studentName;
//    }
//
//    public long getFatherName() {
//        return fatherName;
//    }
//
//    public void setFatherName(long fatherName) {
//        this.fatherName = fatherName;
//    }
}