package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println("北京希腊披萨原材料");
    }
}
