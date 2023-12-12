package com.practice.demo.service;

import com.practice.demo.dto.WeatherDto;
import com.practice.demo.entity.Weather;

import java.util.List;
import java.util.Optional;

public interface WeatherService {
    List<Weather> listAllLocation();

    List <WeatherDto> getAllLocationDetails();

    Weather getSingleLocation(Long id);

    Weather createNew(Weather weather );
    Weather updateExisting(Weather weather);

    void deleteLocation(Long id);
}
