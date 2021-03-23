package com.ddddvia.patterndesign.factory.factorymethod.pizzastore.order;

import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza;
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("�����ɹ�");
                System.out.println("================");
            } else {
                System.out.println("����ʧ��");
                System.out.println("================");
            }
        } while (true);
    }

    /**
     * ���ö�������
     */
    private String getOrderType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("����Pizza������");
            String str = strIn.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
