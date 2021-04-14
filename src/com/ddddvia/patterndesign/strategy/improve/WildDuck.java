package com.ddddvia.patterndesign.strategy.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class WildDuck extends Duck {
    public WildDuck() {
       this.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("’‚ «“∞—º");
    }
}
