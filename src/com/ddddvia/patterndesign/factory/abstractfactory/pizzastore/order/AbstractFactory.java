package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public interface AbstractFactory {
     Pizza createPizza(String orderType);
}
