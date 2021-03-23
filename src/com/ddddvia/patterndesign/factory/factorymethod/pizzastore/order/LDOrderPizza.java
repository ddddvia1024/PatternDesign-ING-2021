package com.ddddvia.patterndesign.factory.factorymethod.pizzastore.order;

import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
