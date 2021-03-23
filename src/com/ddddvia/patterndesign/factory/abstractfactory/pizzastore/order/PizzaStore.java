package com.ddddvia.patterndesign.factory.abstractfactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.order.BJOrderPizza;
import com.ddddvia.patterndesign.factory.factorymethod.pizzastore.order.LDOrderPizza;

import java.util.Scanner;

/**
 * 客户端
 *
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        System.out.println("请输入订购商店：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("BJ")) {

            new OrderPizza(new BJFactory());
        } else if (str.equals("LD")) {
            new OrderPizza(new LDFactory());
        }
    }
}
