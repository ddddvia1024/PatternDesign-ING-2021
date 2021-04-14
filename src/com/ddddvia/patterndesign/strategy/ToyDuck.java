package com.ddddvia.patterndesign.strategy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }
}
