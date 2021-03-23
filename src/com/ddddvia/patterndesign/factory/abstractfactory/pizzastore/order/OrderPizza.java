package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class OrderPizza {
    private AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        setAbstractFactory(abstractFactory);

    }

    private void setAbstractFactory(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
        String orderType = "";
        do {

            Pizza pizza;
            orderType = getOrderType();
            pizza = abstractFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("∂©π∫≥…π¶");
                System.out.println("================");
            } else {
                System.out.println("∂©π∫ ß∞‹");
                System.out.println("================");
            }
        } while (true);
    }


    private String getOrderType() {
        String str = "";
        System.out.println("«Î ‰»Î≈˚»¯¿‡–Õ£∫");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        return str;
    }
}
