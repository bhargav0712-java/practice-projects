package com.practice.demo.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OfficeDto {

    private Long empId;
    private String empName;
    private String empJobRole;
    private String empEmail;
    private Double empSalary;
    private String empAddress;

}
