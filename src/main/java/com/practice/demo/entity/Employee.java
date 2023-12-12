package com.practice.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb001_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "employee_id")

    private long employeeId;


    @Column (name = "first_name")
    private String firstName;
    @Column (name = "second_name")
    private String secondName;
    @Column(name = "phone_no")
    private long phoneNo;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
