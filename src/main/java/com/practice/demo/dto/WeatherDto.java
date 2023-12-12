package com.practice.demo.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {
    private Long id;
    private String location;
    private String weatherDescription;
    private Double temperature;

}
