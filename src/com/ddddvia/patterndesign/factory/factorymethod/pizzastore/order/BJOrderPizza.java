package com.ddddvia.patterndesign.factory.factorymethod.pizzastore.order;

import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
