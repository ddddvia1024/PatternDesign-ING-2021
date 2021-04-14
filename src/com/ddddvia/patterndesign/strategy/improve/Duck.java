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
        System.out.println("Ѽ�Ӹ¸½�");
    }
    public void swim(){
        System.out.println("Ѽ�ӻ���Ӿ");
    }
    public void fly(){
        this.display();
        flyBehavior.fly();
    }
    public abstract void display();
}
