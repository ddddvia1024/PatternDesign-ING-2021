package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("����ϣ������");
        System.out.println("����ϣ������ԭ����");
    }
}
