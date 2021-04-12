package com.ddddvia.patterndesign.observer;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions conditions;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public WeatherData(CurrentConditions currentConditions){
        this.conditions = currentConditions;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    void dataChange(){
        conditions.update(getTemperature(),getPressure(),getHumidity());
    }

}
