package com.ddddvia.patterndesign.strategy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class PekingDuck extends Duck{

    @Override
    public void display() {
        System.out.println("���Ǳ���Ѽ");
    }

    @Override
    public void fly(){
        System.out.println("����Ѽ�����");
    }


}
