package com.ddddvia.patterndesign.strategy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class Duck {
    public void quack(){
        System.out.println("Ѽ�Ӹ¸½�");
    }
    public void swim(){
        System.out.println("Ѽ�ӻ���Ӿ");
    }
    public void fly(){
        System.out.println("Ѽ�ӻ��");
    }
    public abstract void display();
}
