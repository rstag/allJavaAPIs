package com.rstest.base.allJavaApi.weatherbot.services;

import com.rstest.base.allJavaApi.weatherbot.model.WeatherHourly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeatherHourlyService {
    List<WeatherHourly> weatherHourly;
    @Autowired
    CheckWeatherService checkWeatherService;
    public WeatherHourlyService(List<WeatherHourly> weatherHourly, CheckWeatherService checkWeatherService) {
        this.weatherHourly = weatherHourly;
        this.checkWeatherService = checkWeatherService;
    }

    public String getWeatherHourly1(String lat, String lon, String ref) {

        return checkWeatherService.checkWeatherHourly1(lat,lon,ref);

    }

    public List<WeatherHourly> getWeatherHourly() {

        checkWeatherService.checkWeatherHourly();
        return weatherHourly;
    }


}
