package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.LDGreekPizza;
import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class LDFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName(" Â×¶ØÏ£À°ÅûÈø ");
        } else if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName(" Â×¶ØÄÌÀÒÅûÈø ");
        }
        return pizza;
    }
}
