package com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("�׶���������");
        System.out.println("�׶���������ԭ����");
    }
}
