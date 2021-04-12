package com.ddddvia.patterndesign.observer.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public  interface Observer {

    void update(float temperature, float pressure, float humidity);
}
