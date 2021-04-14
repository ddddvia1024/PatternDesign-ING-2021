package com.ddddvia.patterndesign.strategy.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
       this.flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("�������Ѽ");
    }


    @Override
    public void quack() {
        System.out.println("���Ѽ�����");
    }

}
