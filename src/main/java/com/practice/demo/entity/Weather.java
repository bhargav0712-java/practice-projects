package com.practice.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name="tb009_weather_data")
@Data
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "location")
    private String location;

    @Column(name = "temperature")
    private double temperature;

    @Column(name = "humidity")
    private double humidity;

    @Column(name = "wind_speed")
    private double windSpeed;

    @Column(name = "weather_description")
    private String weatherDescription;

    @Column(name = "date_time")
    private LocalDateTime dateTime;
}
