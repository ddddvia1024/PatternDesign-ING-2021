package com.ddddvia.patterndesign.observer.improve;

import java.util.ArrayList;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CurrentCondition condition =new CurrentCondition();
        BaiDu baiDu = new BaiDu();

        WeatherData weatherData = new WeatherData();
        weatherData.setData(10L,20L,30L);
        weatherData.register(condition);
        weatherData.register(baiDu);
        weatherData.notifyObservers();
    }
}
