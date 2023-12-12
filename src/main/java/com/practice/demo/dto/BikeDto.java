package com.practice.demo.dto;

import lombok.Data;

import java.time.YearMonth;

@Data
public class BikeDto {
    private long id;
    private String bikeName;
    private String brandName;
    private Double amount;
    private Long mileage;
}
