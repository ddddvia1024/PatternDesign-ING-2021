package com.ddddvia.patterndesign.factory.factorymethod.pizzastore.order;

import java.util.Scanner;

/**
 * �ͻ���
 *
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        System.out.println("�����붩���̵꣺");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("BJ")) {
            new BJOrderPizza();
        } else if (str.equals("LD")) {
            new LDOrderPizza();
        }
    }
}
