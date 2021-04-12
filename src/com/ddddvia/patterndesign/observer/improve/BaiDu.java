package com.ddddvia.patterndesign.observer.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class BaiDu implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("BaiDu{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}');
    }
}
