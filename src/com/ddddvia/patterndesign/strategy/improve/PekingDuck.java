package com.ddddvia.patterndesign.strategy.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        this.flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

}
