package com.practice.demo.dto;

import lombok.Data;

@Data
public class LiquorDto {
    private Long storeId;
    private String name;
    private String location;
    private String storeLicenseNo;
    private Double totalAmount;
    private Double profit;

}
