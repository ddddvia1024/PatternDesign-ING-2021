package com.ddddvia.patterndesign.factory.simplefactory.pizzastore.order;

import com.ddddvia.patterndesign.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.setName(orderType);
                //���Pizza����������
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("�����ɹ�");
                System.out.println("==========================");
            } else {
                System.out.println("����ʧ��");
                System.out.println("==========================");
            }
        } while (true);
    }


    //    // ������
//    public OrderPizza() {
//        //������pizza
//        Pizza pizza = null;
//        do {
//            //������pizza����
//            String orderType;
//            orderType = getOrderType();
////            if (orderType.equals("greek")) {
////                pizza = new GreekPizza();
////            } else if (orderType.equals("cheese")) {
////                pizza = new CheesePizza();
////            } else {
////                break;
////            }
//            pizza.setName(orderType);
//            //���Pi   zza����������
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza() {
        do {
            setSimpleFactory(new SimpleFactory());
            //���Pizza����������
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
