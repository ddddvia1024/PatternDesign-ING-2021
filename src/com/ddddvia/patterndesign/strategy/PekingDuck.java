package com.ddddvia.patterndesign.strategy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class PekingDuck extends Duck{

    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    @Override
    public void fly(){
        System.out.println("北京鸭不会飞");
    }


}
