package com.rstest.base.allJavaApi.weatherbot.controllers;

import com.rstest.base.allJavaApi.weatherbot.services.WeatherDailyService;
import com.rstest.base.allJavaApi.weatherbot.services.WeatherHourlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weatherbot")
public class WeatherDailyController {
    @Autowired
    WeatherDailyService weatherDailyService;

    public WeatherDailyController(WeatherDailyService weatherDailyService) {
        this.weatherDailyService = weatherDailyService;
    }

    @GetMapping("/getWeatherDaily")
    public String getWeatherDaily(@RequestParam(value = "lat", required = true) String lat,
                                   @RequestParam(value = "lon", required = true) String lon,
                                   @RequestParam(value = "ref", required = true) String ref){

        return weatherDailyService.getWeatherDaily(lat,lon,ref);
    }
}
