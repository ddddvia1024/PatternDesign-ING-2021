package com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("�׶�ϣ������");
        System.out.println("�׶�ϣ������ԭ����");
    }
}
