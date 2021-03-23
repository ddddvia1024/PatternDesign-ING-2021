package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza;


/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨原材料");
    }
}
