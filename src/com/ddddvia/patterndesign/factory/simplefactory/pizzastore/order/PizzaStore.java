package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.order;

/**
 * �ͻ���
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
