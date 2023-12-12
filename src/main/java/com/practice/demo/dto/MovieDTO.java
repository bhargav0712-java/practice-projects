package com.practice.demo.dto;

import lombok.*;

@Data
public class MovieDTO {
    private Long id;
    private String title;
    private String director;
    private Integer releaseYear;

}
