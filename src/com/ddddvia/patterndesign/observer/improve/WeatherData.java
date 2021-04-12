package com.ddddvia.patterndesign.observer.improve;

import java.util.ArrayList;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observerArrayList;

    public WeatherData() {
        observerArrayList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerArrayList.add(observer);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void remove(Observer observer) {
        observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerArrayList) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        notifyObservers();
    }
}
