package com.ddddvia.patterndesign.strategy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("�������Ѽ");
    }

    @Override
    public void fly() {
        System.out.println("���Ѽ�����");
    }

    @Override
    public void quack() {
        System.out.println("���Ѽ�����");
    }

    @Override
    public void swim() {
        System.out.println("���Ѽ������Ӿ");
    }
}
