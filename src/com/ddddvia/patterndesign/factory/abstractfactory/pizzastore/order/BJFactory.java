package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.BJGreekPizza;
import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class BJFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName(" 北京希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName(" 北京奶酪披萨 ");
        }
        return pizza;
    }
}
