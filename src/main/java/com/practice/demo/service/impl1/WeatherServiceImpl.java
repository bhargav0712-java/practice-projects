package com.practice.demo.service.impl1;

import com.practice.demo.dto.WeatherDto;
import com.practice.demo.entity.Weather;
import com.practice.demo.repo.WeatherRepo;
import com.practice.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepo weatherRepo;

    @Autowired
    public WeatherServiceImpl(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    @Override
    public List<Weather> listAllLocation() {
        return weatherRepo.findAll();
    }

    @Override
    public Weather getSingleLocation(Long id) {
        Optional<Weather> weather = weatherRepo.findById(id);
        if(weather.isPresent()){
            return weather.get();
        }
        throw new RuntimeException("Location Details not available" + id);
    }

    @Override
    public Weather createNew(Weather weather) {
        return weatherRepo.save(weather);
    }

    @Override
    public Weather updateExisting(Weather weather ) {
        return weatherRepo.save(weather);
    }

    @Override
    public void deleteLocation(Long id) {
        weatherRepo.deleteById(id);
    }

    private WeatherDto convertEntityToDto( Weather weather){
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setId(weather.getId());
        weatherDto.setLocation(weather.getLocation());
        weatherDto.setTemperature(weather.getTemperature());
        weatherDto.setWeatherDescription(weather.getWeatherDescription());
        return weatherDto;
    }

    public List<WeatherDto> getAllLocationDetails(){
        List<Weather> weatherList = weatherRepo.findAll();
        List<WeatherDto> weatherDtoList = new ArrayList<>();
        for (Weather weather : weatherList){
             WeatherDto weatherDto = convertEntityToDto(weather);
             weatherDtoList.add(weatherDto);
        }
        return weatherDtoList;
    }
}
