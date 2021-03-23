package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
