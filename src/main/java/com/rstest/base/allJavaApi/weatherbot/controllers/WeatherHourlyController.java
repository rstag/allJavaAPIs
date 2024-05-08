package com.rstest.base.allJavaApi.weatherbot.controllers;

import com.rstest.base.allJavaApi.weatherbot.model.WeatherHourly;
import com.rstest.base.allJavaApi.weatherbot.services.WeatherHourlyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weatherbot")
public class WeatherHourlyController {

    WeatherHourlyService weatherHourlyService;

    public WeatherHourlyController(WeatherHourlyService weatherHourlyService) {
        this.weatherHourlyService = weatherHourlyService;
    }

    @GetMapping("/getWeatherHourly")
    public List<WeatherHourly> getUsers(){

        return weatherHourlyService.getWeatherHourly();
    }

    @GetMapping("/getWeatherHourly1")
    public String getWeatherHourly(@RequestParam(value = "lat", required = true) String lat,
                                   @RequestParam(value = "lon", required = true) String lon,
                                   @RequestParam(value = "ref", required = true) String ref){

        return weatherHourlyService.getWeatherHourly1(lat,lon,ref);
    }

}
