package com.rstest.base.allJavaApi.weatherbot.services;

import com.google.gson.Gson;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@Service
public class CheckWeatherService {

    String weatherHourly="";
    String weatherDaily="";

    public void checkWeatherHourly() {
        try {

            Gson gson = new Gson();
            HttpRequest getReq = HttpRequest.newBuilder()
                    .uri(new URI("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/hourly?lat=40.70&&lon=-74.06"))
                    .setHeader("X-RapidAPI-Key", "d440c309famsh260a9639803fadep103d24jsn46366a82b1af")
                    .setHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();

            HttpResponse<String> getRes = httpClient.send(getReq, HttpResponse.BodyHandlers.ofString());
            System.out.println(getRes.body());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String checkWeatherHourly1(String lat, String lon,String ref) {
        try {
            if(weatherHourly.isEmpty() || ref.equals("true")) {
                Gson gson = new Gson();
                String url = "https://weatherbit-v1-mashape.p.rapidapi.com/forecast/hourly?lat=" + lat + "&&lon=" + lon+ "&&ref=" + ref;
                HttpRequest getReq = HttpRequest.newBuilder()
                        .uri(new URI(url))
                        .setHeader("X-RapidAPI-Key", "d440c309famsh260a9639803fadep103d24jsn46366a82b1af")
                        .setHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                        .setHeader("Access-Control-Allow-Origin", "*")
                        .setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept")
                        .build();

                HttpClient httpClient = HttpClient.newHttpClient();

                HttpResponse<String> getRes = httpClient.send(getReq, HttpResponse.BodyHandlers.ofString());
                System.out.println("here");
                weatherHourly = getRes.body();
            }
            System.out.println(weatherHourly);
            return weatherHourly;
        } catch (Exception e) {
            System.out.println(e);
            return "Error";
        }
    }

    public String checkWeatherDaily(String lat, String lon, String ref) {
        try {
            if(weatherDaily.isEmpty() || ref.equals("true")) {
                Gson gson = new Gson();
                String url = "https://weatherbit-v1-mashape.p.rapidapi.com/forecast/daily?lat=" + lat + "&&lon=" + lon;
                HttpRequest getReq = HttpRequest.newBuilder()
                        .uri(new URI(url))
                        .setHeader("X-RapidAPI-Key", "d440c309famsh260a9639803fadep103d24jsn46366a82b1af")
                        .setHeader("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                        .setHeader("Access-Control-Allow-Origin", "*")
                        .setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept")
                        .build();

                HttpClient httpClient = HttpClient.newHttpClient();

                HttpResponse<String> getRes = httpClient.send(getReq, HttpResponse.BodyHandlers.ofString());
                System.out.println("here");
                weatherDaily = getRes.body();
            }
            System.out.println(weatherDaily);
            return weatherDaily;
        } catch (Exception e) {
            System.out.println(e);
            return "Error";
        }
    }
}
