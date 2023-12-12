package com.practice.demo.controller;

import com.practice.demo.dto.WeatherDto;
import com.practice.demo.entity.Weather;
import com.practice.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {


    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping
    public List<Weather> findAllLocations(){
        return weatherService.listAllLocation();
    }

    @GetMapping("/weather/{id}")
    public Weather getLocation(@PathVariable Long id){
        return weatherService.getSingleLocation(id);
    }
    @PostMapping ("/create")
    public Weather createNew(@RequestBody Weather weather){
        return weatherService.createNew(weather);
    }

    @PutMapping("/weather/{id}")
    public Weather updateExisting(@PathVariable Long id, @RequestBody Weather weather){
        weather.setId(id);
        return weatherService.updateExisting(weather);
    }
    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable Long id){
        weatherService.deleteLocation(id);
    }

    @GetMapping("/weather/new")
    public List<WeatherDto> getAllLocationDet(){
        return weatherService.getAllLocationDetails();
    }
    }



