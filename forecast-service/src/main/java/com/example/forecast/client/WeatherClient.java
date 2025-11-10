package com.example.forecast.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "weather-service")
public interface WeatherClient {
   
    @GetMapping("/api/weather/{city}")
    Map<String, Object> getWeather(@PathVariable("city") String city);
}
