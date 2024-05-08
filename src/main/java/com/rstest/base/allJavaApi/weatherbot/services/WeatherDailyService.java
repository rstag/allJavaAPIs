package com.rstest.base.allJavaApi.weatherbot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherDailyService {
    @Autowired
    CheckWeatherService checkWeatherService;

    public String getWeatherDaily(String lat, String lon, String ref) {
        return checkWeatherService.checkWeatherDaily(lat,lon,ref);
    }
}
