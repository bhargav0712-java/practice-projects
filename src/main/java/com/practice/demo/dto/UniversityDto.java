package com.practice.demo.dto;

import lombok.Data;

@Data
public class UniversityDto {
    private Long id;
    private String name;
    private String location;
    private String mailId;
    private Long landLineNo;
    private Double fee;
}
