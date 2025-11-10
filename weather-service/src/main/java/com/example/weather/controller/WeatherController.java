package com.example.weather.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    
    @GetMapping("/api/weather/{city}")
    public Map<String, Object> getWeather(@PathVariable String city) {
        return Map.of(
            "city", city,
            "temperature", 22,
            "condition", "Sunny"
        );
    }
}
