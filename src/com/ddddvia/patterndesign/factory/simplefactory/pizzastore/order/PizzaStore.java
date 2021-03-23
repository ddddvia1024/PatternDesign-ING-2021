package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.order;

/**
 * ¿Í»§¶Ë
 *
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
         new OrderPizza(new SimpleFactory());
    }
}
