package com.ddddvia.patterndesign.strategy.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck(){
    }

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }
    public void swim(){
        System.out.println("鸭子会游泳");
    }
    public void fly(){
        this.display();
        flyBehavior.fly();
    }
    public abstract void display();
}
