package com.ddddvia.patterndesign.strategy.improve;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("���Ѽ�Ӳ����");
    }
}
