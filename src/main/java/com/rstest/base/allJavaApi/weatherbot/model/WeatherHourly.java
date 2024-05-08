package com.rstest.base.allJavaApi.weatherbot.model;

public class WeatherHourly {

    private float lat;
    private float lon;

    public WeatherHourly(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }
}
