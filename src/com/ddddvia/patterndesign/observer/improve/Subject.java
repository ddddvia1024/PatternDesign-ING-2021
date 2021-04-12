package com.ddddvia.patterndesign.observer.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public interface Subject {

    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
