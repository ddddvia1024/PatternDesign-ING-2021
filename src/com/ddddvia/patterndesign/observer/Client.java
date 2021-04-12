package com.ddddvia.patterndesign.observer;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions conditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(conditions);
        weatherData.setData(10L,20L,30L);
        weatherData.dataChange();
    }


}
